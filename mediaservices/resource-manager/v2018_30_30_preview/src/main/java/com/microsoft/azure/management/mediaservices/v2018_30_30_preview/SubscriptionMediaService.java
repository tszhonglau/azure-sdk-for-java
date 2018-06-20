/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation.MediaManager;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation.SubscriptionMediaServiceInner;
import java.util.UUID;
import java.util.List;
import java.util.Map;

/**
 * Type representing SubscriptionMediaService.
 */
public interface SubscriptionMediaService extends HasInner<SubscriptionMediaServiceInner>, HasManager<MediaManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the mediaServiceId value.
     */
    UUID mediaServiceId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the storageAccounts value.
     */
    List<StorageAccount> storageAccounts();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}