package com.econetwireless.epay.business.utils;

import com.econetwireless.in.soap.messages.BalanceResponse;
import com.econetwireless.in.soap.messages.CreditRequest;
import com.econetwireless.in.soap.messages.CreditResponse;
import com.econetwireless.utils.pojo.INBalanceResponse;
import com.econetwireless.utils.pojo.INCreditRequest;
import com.econetwireless.utils.pojo.INCreditResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class MessageConvertersTest {

    @Mock
    private CreditResponse creditResponse;

    @Mock
    private INCreditResponse increditResponse;

    @Mock
    private BalanceResponse balanceResponse;

    @Mock
    private INBalanceResponse inbalanceResponse;

    MessageConverters messageConverters;

    @Mock
    private INCreditRequest inCreditRequest;

    @Mock
    private CreditRequest creditRequest;

    @Before
    public void intMocks() throws ClassNotFoundException{
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConvertCreditResponse() {
        creditResponse=new CreditResponse();
        assertNotNull(messageConverters.convert(creditResponse));
        creditResponse=null;
        assertNull(messageConverters.convert(creditResponse));
    }

    @Test
    public void testConvertINBalanceResponse() {
        inbalanceResponse=new INBalanceResponse();
        assertNotNull(messageConverters.convert(inbalanceResponse));
        inbalanceResponse=null;
        assertNull(messageConverters.convert(inbalanceResponse));
    }


    @Test
    public void testConvertBalanceResponse() {
        balanceResponse=new BalanceResponse();
        assertNotNull(messageConverters.convert(balanceResponse));
        balanceResponse=null;
        assertNull(messageConverters.convert(balanceResponse));
    }
    @Test
    public void testConvertINCreditRequest() {
        inCreditRequest=new INCreditRequest();
        assertNotNull(messageConverters.convert(inCreditRequest));
        inCreditRequest=null;
        assertNull(messageConverters.convert(inCreditRequest));

    }

    @Test
    public void testConvertCreditRequest() {
        creditRequest=new CreditRequest();
        assertNotNull(messageConverters.convert(creditRequest));
        creditRequest=null;
        assertNull(messageConverters.convert(creditRequest));
    }

    @Test
    public void testConvertINCreditResponse() {
        increditResponse=new INCreditResponse();
        assertNotNull(messageConverters.convert(increditResponse));
        increditResponse=null;
        assertNull(messageConverters.convert(increditResponse));
    }



}