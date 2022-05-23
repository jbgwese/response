package com.econetwireless.epay.business.services.impl;

import com.econetwireless.epay.dao.subscriberrequest.api.SubscriberRequestDao;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ReportingServiceImplTest {

    private ReportingServiceImpl reportingService;

    @Mock
    SubscriberRequestDao subscriberRequestDao;

    private String partnerCode="hot-recharge";

    @Before
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
        reportingService=new ReportingServiceImpl(subscriberRequestDao);
    }

    @Test
    public void testFindSubscriberRequestsByPartnerCode() {
        reportingService.findSubscriberRequestsByPartnerCode(partnerCode);
        verify(subscriberRequestDao, times(1)).findByPartnerCode(partnerCode);
    }

}
