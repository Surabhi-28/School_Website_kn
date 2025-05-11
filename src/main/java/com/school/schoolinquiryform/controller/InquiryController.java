package com.school.schoolinquiryform.controller;

import com.school.schoolinquiryform.entity.Inquiry;
import com.school.schoolinquiryform.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InquiryController {

    @Autowired
    private InquiryRepository inquiryRepository;

    @PostMapping("/submitForm")
    public String handleForm(@ModelAttribute Inquiry inquiry) {
        inquiryRepository.save(inquiry);
        return "redirect:/admissionForm.html"; // redirect after saving
    }
}
