package com.trkj.asms.service;

import com.trkj.asms.entity.Duein;

import java.util.List;

public interface DueinService {
    List<Duein> findduein();
    Duein adddueinAll(Duein duein);
}
