package com.bssoufo;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * MaClasseTest
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MaClasse.class)
public class MaClasseTest {
    private MaClasse maClasse;
    @Before
	public void setUp() {
		 maClasse = new MaClasse();
    }
    
    @Test()
    public void incrementerDeUnTest() throws Exception {
        MaDao daoMock = mock(MaDao.class);    
        PowerMockito.whenNew(MaDao.class).withAnyArguments().thenReturn(daoMock);
        Assert.assertEquals(3, maClasse.incrementerDeUn(2));
	
    }


}