/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.InstanceViewStatus;
import com.microsoft.azure.management.compute.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Create or update availability set parameters.
 */
@JsonFlatten
public class AvailabilitySetInner extends Resource {
    /**
     * Update Domain count.
     */
    @JsonProperty(value = "properties.platformUpdateDomainCount")
    private Integer platformUpdateDomainCount;

    /**
     * Fault Domain count.
     */
    @JsonProperty(value = "properties.platformFaultDomainCount")
    private Integer platformFaultDomainCount;

    /**
     * A list of references to all virtual machines in the availability set.
     */
    @JsonProperty(value = "properties.virtualMachines")
    private List<SubResource> virtualMachines;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "properties.statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstanceViewStatus> statuses;

    /**
     * If the availability set supports managed disks.
     */
    @JsonProperty(value = "properties.managed")
    private Boolean managed;

    /**
     * Sku of the availability set.
     */
    private Sku sku;

    /**
     * Get the platformUpdateDomainCount value.
     *
     * @return the platformUpdateDomainCount value
     */
    public Integer platformUpdateDomainCount() {
        return this.platformUpdateDomainCount;
    }

    /**
     * Set the platformUpdateDomainCount value.
     *
     * @param platformUpdateDomainCount the platformUpdateDomainCount value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformUpdateDomainCount(Integer platformUpdateDomainCount) {
        this.platformUpdateDomainCount = platformUpdateDomainCount;
        return this;
    }

    /**
     * Get the platformFaultDomainCount value.
     *
     * @return the platformFaultDomainCount value
     */
    public Integer platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    /**
     * Set the platformFaultDomainCount value.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.platformFaultDomainCount = platformFaultDomainCount;
        return this;
    }

    /**
     * Get the virtualMachines value.
     *
     * @return the virtualMachines value
     */
    public List<SubResource> virtualMachines() {
        return this.virtualMachines;
    }

    /**
     * Set the virtualMachines value.
     *
     * @param virtualMachines the virtualMachines value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withVirtualMachines(List<SubResource> virtualMachines) {
        this.virtualMachines = virtualMachines;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get the managed value.
     *
     * @return the managed value
     */
    public Boolean managed() {
        return this.managed;
    }

    /**
     * Set the managed value.
     *
     * @param managed the managed value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withManaged(Boolean managed) {
        this.managed = managed;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the AvailabilitySetInner object itself.
     */
    public AvailabilitySetInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}