package controllers;

import java.util.List;

import models.StdKomp;
import play.mvc.Controller;

public class CStdKomp extends Controller {

	public static List<StdKomp> getDataList() {
		return StdKomp.find("ORDER BY namastdkomp ASC").fetch();
	}
	
    /**
     *
     */
    public static void manage() {
        List<StdKomp> stdkomps = StdKomp.find("ORDER BY namastdkomp ASC").fetch();
        render(stdkomps);
    }
    
    /**
     *
     * @param id
     */
    public static void form(Long id) {
    	if (id == null) render();
    	StdKomp stdkomp = StdKomp.findById(id);
		render(stdkomp);
	}
    
    /**
     *
     * @param id
     * @param namaJurusan
     * @param fakultas
     * @param isAjax
     */
    public static void simpan(Long id, String kodestdkomp,String namastdkomp, Boolean isAjax) {
    	StdKomp stdkomp;
		if (id == null){
			stdkomp = new StdKomp(kodestdkomp, namastdkomp);		
		}else {
			stdkomp = StdKomp.findById(id);
			stdkomp.kodestdkomp = kodestdkomp;
			stdkomp.namastdkomp = namastdkomp;
			
		}
		//validation.valid(jurusan);
		if (validation.hasErrors()) {
			if (isAjax != null) renderHtml("<h4>Oops! Gagal.</h4>"+validation.errorsMap());
			//else render("@form", jurusan);
		}
		stdkomp.save();
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
    	List<StdKomp> listData = StdKomp.find("ORDER BY namastdkomp ASC").fetch();
		String tabel = ""; int i = 1;
		for (StdKomp data: listData) {
			tabel = tabel +
				"<tr>" +
				"<td><input type='checkbox' name='data[]' value='"+data.id+"' id='myCheck' /></td>" +
				"<td>"+i+"</td>" +
				"<td>"+data.kodestdkomp+"</td>" +
				"<td>"+data.namastdkomp+"</td>" +
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
			StdKomp.delete("id=?1", id);
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
				StdKomp.delete("id=?1", data[i]);
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
