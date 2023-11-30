package com.zuber.SecondMiniPro.services;

import com.zuber.SecondMiniPro.binding.DashBoardResponse;
import com.zuber.SecondMiniPro.binding.EnquiryForm;
import com.zuber.SecondMiniPro.binding.EnquirySearchCriteria;

import java.util.List;

public interface EnquiryService {

    public List<String> getCourseName();

    public List<String> getEnqStatus();

    public DashBoardResponse getDashBoardRes(Integer userId);

    public List<EnquiryForm> getEnquiries(Integer userId, EnquirySearchCriteria criteria);

    public EnquiryForm getEnquiry(Integer enqId);
}
