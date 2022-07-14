package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

public class testCasinoAccount {
    @Test
    public void testConstructor() {
        //given
        String accountName = "Eugene";
        String accountPassword = "Shin";
        //when
        CasinoAccount casinoAccount = new CasinoAccount(accountName, accountPassword);
        //then
        Assert.assertEquals(accountName,casinoAccount.getAccountName());
        Assert.assertEquals(accountPassword,casinoAccount.getAccountPassword());
    }

    @Test
    public void testSetAccountName() {
        //given
        String accountName = "Eugene";
        String accountPassword = "Shin";
        //when
        CasinoAccount casinoAccount = new CasinoAccount(accountName, accountPassword);
        String str = "Paul";
        casinoAccount.setAccountName(str);
        String actual = casinoAccount.getAccountName();
        //then
        Assert.assertEquals(str,actual);
    }
    @Test
    public void testSetAccountPassword() {
        //given
        String accountName = "Eugene";
        String accountPassword = "Shin";
        //when
        CasinoAccount casinoAccount = new CasinoAccount(accountName, accountPassword);
        String str = "Kim";
        casinoAccount.setAccountPassword(str);
        String actual = casinoAccount.getAccountPassword();
        //then
        Assert.assertEquals(str,actual);
    }

    @Test
    public void testSetBalance() {
        //given
        String accountName = "Eugene";
        String accountPassword = "Shin";
        Integer balance = 0;
        //when
        CasinoAccount casinoAccount = new CasinoAccount(accountName, accountPassword);
        Integer num = 2000;
        casinoAccount.setBalance(num);
        Integer actual = casinoAccount.getBalance();
        //then
        Assert.assertEquals(num,actual);
    }
}
