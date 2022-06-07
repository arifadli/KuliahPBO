package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import models.BidangIlmu;
import models.User;

import play.data.Upload;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

public class CBidangIlmu extends Controller {

	
    /**
     *
     * @return
     */
    public static List<BidangIlmu> getDataList() {
		return BidangIlmu.find("ORDER BY namabidilmu ASC").fetch();
	}
	
    /**
     *
     */
    public static void manage() {
        List<BidangIlmu> bidangilmus = BidangIlmu.find("ORDER BY namabidilmu ASC").fetch();
        render(bidangilmus);
    }
    
    /**
     *
     * @param id
     */
    public static void form(Long id) {
    	if (id == null) render();
    	BidangIlmu bidangilmu = BidangIlmu.findById(id);
		render(bidangilmu);
	}
    
    /**
     *
     * @param id
     * @param namaJurusan
     * @param fakultas
     * @param isAjax
     */
    public static void simpan(Long id, String kodebidilmu,String namabidilmu, Boolean isAjax) {
    	BidangIlmu bidangilmu;
		if (id == null){
			bidangilmu = new BidangIlmu(kodebidilmu, namabidilmu);		
		}else {
			bidangilmu = BidangIlmu.findById(id);
			bidangilmu.kodebidilmu = kodebidilmu;
			bidangilmu.namabidilmu = namabidilmu;
			
		}
		//validation.valid(jurusan);
		if (validation.hasErrors()) {
			if (isAjax != null) renderHtml("<h4>Oops! Gagal.</h4>"+validation.errorsMap());
			//else render("@form", jurusan);
		}
		bidangilmu.save();
		if (isAjax != null) renderHtml("<h4>Berhasil</h4>Data Berhasil Disimpan.");
		else {
			String url = "manage";
			String judul = "Berhasil";
			String pesan = "Data Berrhasil Disimpan.";
			renderTemplate("Application/notif.html", url, judul, pesan);
		}
	}
    
    /**
     *
     */
    public static void tampilAjax() {
    	List<BidangIlmu> listData = BidangIlmu.find("ORDER BY namabidilmu ASC").fetch();
		String tabel = ""; int i = 1;
		for (BidangIlmu data: listData) {
			tabel = tabel +
				"<tr>" +
				"<td><input type='checkbox' name='data[]' value='"+data.id+"' id='myCheck' /></td>" +
				"<td>"+i+"</td>" +
				"<td>"+data.kodebidilmu+"</td>" +
				"<td>"+data.namabidilmu+"</td>" +
				"<td><a href='form?id="+data.id+"' title='Edit' class='glyphicon glyphicon-pencil'></a>" +
				"&nbsp;" +
				"<a href=\"javascript:delMe("+data.id+");\" title='Delete' class='glyphicon glyphicon-trash'></a></td>" +
				"</tr>";
			i++;
		}
		renderHtml(tabel);
	}
    
    /**
     *
     * @param id
     */
    public static void hapus(Long id) {
    	notFoundIfNull(id);
		try {
			BidangIlmu.delete("id=?1", id);
			renderHtml("<h4>Berhasil</h4>Data Berhasil Dihapus.");
		} catch (Exception e) {
			renderHtml("<h4>Oops! Gagal.</h4>Anda hanya diperbolehkan menghapus jurusan yang belum terikat dengan entitas lain (Prodi).");
		}
	}
    
    /**
     *
     * @param data
     */
    public static void hapusAll(Long[] data) {
    	notFoundIfNull(data);
    	Boolean isError = false;
    	for (int i = 0; i < data.length; i++) {
			try {
				BidangIlmu.delete("id=?1", data[i]);
			} catch (Exception e) {
				isError = true;
			}
		}
    	if (isError)
			renderHtml("<h4>Oops! Gagal.</h4>Penghapusan gagal. Anda hanya diperbolehkan menghapus jurusan yang belum terikat dengan entitas lain (Prodi).");
		else renderHtml("<h4>Berhasil</h4>Data Berhasil Dihapus.");
	}

    /**
     *
     * @param file
     * @throws Throwable
     */   
}