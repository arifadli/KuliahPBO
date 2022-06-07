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
import models.Matakuliah;
import models.User;

import play.data.Upload;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

public class CMatakuliah extends Controller {
	
    /**
     *
     * @return
     */
    public static List<Matakuliah> getDataList() {
		return Matakuliah.find("ORDER BY kodemk ASC").fetch();
	}
	
    /**
     *
     */
    public static void manage() {
        List<Matakuliah> matakuliahs = Matakuliah.find("ORDER BY kodemk ASC").fetch();
        render(matakuliahs);
    }
    
    /**
     *
     * @param id
     */
    public static void form(Long id) {
		if (id == null) render();
		Matakuliah matakuliah = Matakuliah.findById(id);
		render(matakuliah);
	}
    
    /**
     *
     * @param id
     * @param namaProdi
     * @param namaProdiIng
     * @param jurusan
     * @param isAjax
     */
    public static void simpan(Long id, String kodemk, String namamk, Long bidangilmu, Boolean isAjax) {
    	Matakuliah matakuliah;
		BidangIlmu bidangilmuku = BidangIlmu.findById(bidangilmu);
		if (id == null) {
			matakuliah = new Matakuliah(kodemk, namamk, bidangilmuku);
		} else {
			matakuliah = Matakuliah.findById(id);
			matakuliah.kodemk = kodemk;
			matakuliah.namamk = namamk;
			matakuliah.bidangilmu = bidangilmuku;
		}
		validation.valid(matakuliah);
		if (validation.hasErrors()) {
			if (isAjax != null) renderHtml("<h4>Oops! Gagal.</h4>"+validation.errorsMap());
			else render("@form", matakuliah);
		}
		matakuliah.save();
		if (isAjax != null) renderHtml("<h4>Berhasil</h4>Data Berhasil Disimpan.");
		else {
			String url = "manage";
			String judul = "Berhasil";
			String pesan = "Prodi Berhasil Disimpan.";
			renderTemplate("Application/notif.html", url, judul, pesan);
		}
	}
    
    /**
     *
     */
    public static void tampilAjax() {
    	List<Matakuliah> listData = Matakuliah.find("ORDER BY namaProdi ASC").fetch();
		String tabel = ""; int i = 1;
		for (Matakuliah data: listData) {
			tabel = tabel +
				"<tr>" +
				"<td><input type='checkbox' name='data[]' value='"+data.id+"' id='myCheck' /></td>" +
				"<td>"+i+"</td>" +
				"<td>"+data.kodemk+"</td>" +
				"<td>"+data.namamk+"</td>" +
				"<td>"+data.bidangilmu.namabidilmu+"</td>" +
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
			Matakuliah.delete("id=?1", id);
			renderHtml("<h4>Berhasil</h4>Data Berhasil Dihapus.");
		} catch (Exception e) {
			renderHtml("<h4>Oops! Gagal.</h4>Anda hanya diperbolehkan menghapus prodi yang belum terikat dengan entitas lain (Mahasiswa, Dosen, dll).");
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
				Matakuliah.delete("id=?1", data[i]);
			} catch (Exception e) {
				isError = true;
			}
		}
    	if (isError)
			renderHtml("<h4>Oops! Gagal.</h4>Anda hanya diperbolehkan menghapus prodi yang belum terikat dengan entitas lain (Mahasiswa, Dosen, dll).");
		else renderHtml("<h4>Berhasil</h4>Data Berhasil Dihapus.");
	}

    /**
     *
     * @param file
     * @throws Throwable
     */
    
}
