package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.business.integrations.api.ChargingPlatform;
import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import com.econetwireless.epay.domain.SubscriberRequest;
import com.econetwireless.utils.pojo.INBalanceResponse;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

public class EnquiriesServiceImplTest {

    private EnquiriesServiceImpl enquiriesServiceImpl;
    @Mock
    private ChargingPlatform chargingPlatform;
    @Autowired
    SubscriberRequest subscriberRequest;

    INBalanceResponse inBalanceResponse;

    @Mock
    private SubscriberRequestDao subscriberRequestDao;

    @Before
    public void testEnquiriesServiceImpl() {
        MockitoAnnotations.initMocks(this);
        inBalanceResponse = new INBalanceResponse();
        enquiriesServiceImpl = new EnquiriesServiceImpl(chargingPlatform, subscriberRequestDao);
    }
}