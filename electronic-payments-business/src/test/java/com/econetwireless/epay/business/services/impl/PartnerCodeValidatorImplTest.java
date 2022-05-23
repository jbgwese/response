package com.econetwireless.epay.business.services.impl;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.econetwireless.epay.business.services.impl.PartnerCodeValidatorImpl;
import com.econetwireless.epay.dao.requestpartner.api.RequestPartnerDao;

public class PartnerCodeValidatorImplTest {

    PartnerCodeValidatorImpl partnerCodeValidatorImpl;

    @Mock
    private RequestPartnerDao requestPartnerDao;

    private String partnerCode="hot-recharge";
    @Before
    public void intiMocks() {
        MockitoAnnotations.initMocks(this);
        partnerCodeValidatorImpl=new PartnerCodeValidatorImpl(requestPartnerDao);
    }

    @Test(expected=Exception.class)
    public void testValidatePartnerCode() {
        partnerCodeValidatorImpl.validatePartnerCode(partnerCode);
        verify(requestPartnerDao, atLeastOnce()).findByCode(partnerCode);
    }

}
