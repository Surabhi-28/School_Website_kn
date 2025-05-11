package com.school.schoolinquiryform.repository;

import com.school.schoolinquiryform.entity.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
}
