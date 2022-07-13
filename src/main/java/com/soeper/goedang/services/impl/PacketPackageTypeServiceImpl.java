package com.soeper.goedang.services.impl;

import com.soeper.goedang.dao.PacketPackageTypeDao;
import com.soeper.goedang.entities.PacketPackageType;
import com.soeper.goedang.services.PacketPackageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PacketPackageTypeServiceImpl implements PacketPackageTypeService {
    @Autowired
    PacketPackageTypeDao packetPackageTypeDao;

    @Override
    public PacketPackageType save(PacketPackageType packetPackageType) {
        return packetPackageTypeDao.save(packetPackageType);
    }

    @Override
    public PacketPackageType get(int id) {
        return packetPackageTypeDao.findById(id).orElse(null);
    }

    @Override
    public PacketPackageType remove(int id) {
        var packetPackageType = get(id);

        if (packetPackageType != null)
            packetPackageTypeDao.delete(packetPackageType);

        return packetPackageType;
    }

    @Override
    public long count() {
        return packetPackageTypeDao.count();
    }
}
