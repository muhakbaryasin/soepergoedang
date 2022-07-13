package com.soeper.goedang.services;

import com.soeper.goedang.entities.PacketPackageType;

public interface PacketPackageTypeService {
    PacketPackageType save(PacketPackageType packetPackageType);
    PacketPackageType get(int id);
    PacketPackageType remove(int id);
    long count();
}
