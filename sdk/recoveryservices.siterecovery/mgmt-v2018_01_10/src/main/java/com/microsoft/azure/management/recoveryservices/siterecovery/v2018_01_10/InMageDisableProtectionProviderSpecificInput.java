/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMage disable protection provider specific input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
public class InMageDisableProtectionProviderSpecificInput extends DisableProtectionProviderSpecificInput {
    /**
     * A value indicating whether the replica VM should be destroyed or
     * retained. Values from Delete and Retain.
     */
    @JsonProperty(value = "replicaVmDeletionStatus")
    private String replicaVmDeletionStatus;

    /**
     * Get a value indicating whether the replica VM should be destroyed or retained. Values from Delete and Retain.
     *
     * @return the replicaVmDeletionStatus value
     */
    public String replicaVmDeletionStatus() {
        return this.replicaVmDeletionStatus;
    }

    /**
     * Set a value indicating whether the replica VM should be destroyed or retained. Values from Delete and Retain.
     *
     * @param replicaVmDeletionStatus the replicaVmDeletionStatus value to set
     * @return the InMageDisableProtectionProviderSpecificInput object itself.
     */
    public InMageDisableProtectionProviderSpecificInput withReplicaVmDeletionStatus(String replicaVmDeletionStatus) {
        this.replicaVmDeletionStatus = replicaVmDeletionStatus;
        return this;
    }

}
