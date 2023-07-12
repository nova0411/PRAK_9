public class Petugas {
    private String namaPetugas;
    private String nim;
    
    public Petugas(String namaPetugas, String nim){
        this.namaPetugas = namaPetugas;
        this.nim = nim;
    }

    public String getNamaPetugas(){
        return namaPetugas;
    }

    public String getNip(){
        return nim;
    }
}
