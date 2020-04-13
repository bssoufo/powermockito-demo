package com.bssoufo;

import org.junit.Assert;

interface IMaDao {
    void save(int a) throws Exception;
}

class MaDaoMock implements IMaDao {
    public void save(int a) throws Exception {
        // Do nothing
    }

}

public class MaClasseWork {
    public int incrementerDeUn(int a, IMaDao dao) throws Exception {
        a = a + 1;
        dao.save(a);
        return a;
    }

    public static void main(String[] args) throws Exception {
        IMaDao dao = new MaDaoMock();
        MaClasseWork maClasse = new MaClasseWork();
        Assert.assertEquals("dddd", 3, maClasse.incrementerDeUn(2, dao));
    }
}
