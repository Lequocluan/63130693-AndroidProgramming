package ntu_63130693.cau2_appdanhsachnhac;

public class BaiHat {
    private String tenBaiHat;
    private String tenCaSi;
    private int avt_BaiHat;
    private int anh_YeuThich;
    private int anh_luaChon;

    public BaiHat(String tenBaiHat, String tenCaSi, int avt_BaiHat, int anh_YeuThich, int anh_luaChon) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.avt_BaiHat = avt_BaiHat;
        this.anh_YeuThich = anh_YeuThich;
        this.anh_luaChon = anh_luaChon;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public int getAvt_BaiHat() {
        return avt_BaiHat;
    }

    public void setAvt_BaiHat(int avt_BaiHat) {
        this.avt_BaiHat = avt_BaiHat;
    }

    public int getAnh_YeuThich() {
        return anh_YeuThich;
    }

    public void setAnh_YeuThich(int anh_YeuThich) {
        this.anh_YeuThich = anh_YeuThich;
    }

    public int getAnh_luaChon() {
        return anh_luaChon;
    }

    public void setAnh_luaChon(int anh_luaChon) {
        this.anh_luaChon = anh_luaChon;
    }
}
