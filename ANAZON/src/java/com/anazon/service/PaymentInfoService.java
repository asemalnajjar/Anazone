/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anazon.service;

import com.anazon.model.PaymentInfo;
import java.util.List;

/**
 *
 * @author Asem
 */
public interface PaymentInfoService {

    public List<PaymentInfo> getAll();

    public PaymentInfo add(PaymentInfo paymentInfo);

    public PaymentInfo get(long id);

    public PaymentInfo update(PaymentInfo paymentInfo);

    public PaymentInfo delete(PaymentInfo paymentInfo);

    public void deleteAll(List<PaymentInfo> selectedPaymentInfos);
}
