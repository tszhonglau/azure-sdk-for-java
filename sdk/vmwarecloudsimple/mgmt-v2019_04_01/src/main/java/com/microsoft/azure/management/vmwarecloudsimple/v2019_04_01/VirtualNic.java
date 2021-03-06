/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import java.util.List;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VirtualNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual NIC model.
 */
public class VirtualNic {
    /**
     * NIC ip address.
     */
    @JsonProperty(value = "ipAddresses")
    private List<String> ipAddresses;

    /**
     * NIC MAC address.
     */
    @JsonProperty(value = "macAddress")
    private String macAddress;

    /**
     * Virtual Network.
     */
    @JsonProperty(value = "network", required = true)
    private VirtualNetworkInner network;

    /**
     * NIC type. Possible values include: 'E1000', 'E1000E', 'PCNET32',
     * 'VMXNET', 'VMXNET2', 'VMXNET3'.
     */
    @JsonProperty(value = "nicType", required = true)
    private NICType nicType;

    /**
     * Is NIC powered on/off on boot.
     */
    @JsonProperty(value = "powerOnBoot")
    private Boolean powerOnBoot;

    /**
     * NIC id.
     */
    @JsonProperty(value = "virtualNicId")
    private String virtualNicId;

    /**
     * NIC name.
     */
    @JsonProperty(value = "virtualNicName", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualNicName;

    /**
     * Get nIC ip address.
     *
     * @return the ipAddresses value
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set nIC ip address.
     *
     * @param ipAddresses the ipAddresses value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get nIC MAC address.
     *
     * @return the macAddress value
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set nIC MAC address.
     *
     * @param macAddress the macAddress value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get virtual Network.
     *
     * @return the network value
     */
    public VirtualNetworkInner network() {
        return this.network;
    }

    /**
     * Set virtual Network.
     *
     * @param network the network value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withNetwork(VirtualNetworkInner network) {
        this.network = network;
        return this;
    }

    /**
     * Get nIC type. Possible values include: 'E1000', 'E1000E', 'PCNET32', 'VMXNET', 'VMXNET2', 'VMXNET3'.
     *
     * @return the nicType value
     */
    public NICType nicType() {
        return this.nicType;
    }

    /**
     * Set nIC type. Possible values include: 'E1000', 'E1000E', 'PCNET32', 'VMXNET', 'VMXNET2', 'VMXNET3'.
     *
     * @param nicType the nicType value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withNicType(NICType nicType) {
        this.nicType = nicType;
        return this;
    }

    /**
     * Get is NIC powered on/off on boot.
     *
     * @return the powerOnBoot value
     */
    public Boolean powerOnBoot() {
        return this.powerOnBoot;
    }

    /**
     * Set is NIC powered on/off on boot.
     *
     * @param powerOnBoot the powerOnBoot value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withPowerOnBoot(Boolean powerOnBoot) {
        this.powerOnBoot = powerOnBoot;
        return this;
    }

    /**
     * Get nIC id.
     *
     * @return the virtualNicId value
     */
    public String virtualNicId() {
        return this.virtualNicId;
    }

    /**
     * Set nIC id.
     *
     * @param virtualNicId the virtualNicId value to set
     * @return the VirtualNic object itself.
     */
    public VirtualNic withVirtualNicId(String virtualNicId) {
        this.virtualNicId = virtualNicId;
        return this;
    }

    /**
     * Get nIC name.
     *
     * @return the virtualNicName value
     */
    public String virtualNicName() {
        return this.virtualNicName;
    }

}
