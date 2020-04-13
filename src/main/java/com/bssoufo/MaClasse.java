package com.bssoufo;

public class MaClasse {
    public int incrementerDeUn(int a) throws Exception {
        MaDao dao = new MaDao();
        a = a + 1;
        dao.save(a);
        return a;
    }
}
