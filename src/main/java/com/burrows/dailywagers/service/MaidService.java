package com.burrows.dailywagers.service;

import com.burrows.dailywagers.model.Maid;

import java.util.List;

public interface MaidService {
    public List<Maid> getMaids(Integer distance);
}
