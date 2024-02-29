package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account();
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawSufficientBalance() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(50.0);
        assertEquals(50.0, withdrawnAmount, 0.01);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        account.deposit(100.0);
        double withdrawnAmount = account.withdraw(150.0);
        assertEquals(0.0, withdrawnAmount, 0.01);
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void testGetBalance() {
        assertEquals(0.0, account.getBalance(), 0.01);
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.01);
    }
}