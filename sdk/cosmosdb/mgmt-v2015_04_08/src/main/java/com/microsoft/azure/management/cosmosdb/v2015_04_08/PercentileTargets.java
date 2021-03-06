/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation.PercentileTargetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PercentileTargets.
 */
public interface PercentileTargets extends HasInner<PercentileTargetsInner> {
    /**
     * Retrieves the metrics determined by the given filter for the given account target region. This url is only for PBS and Replication Latency data.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param targetRegion Target region to which data is written. Cosmos DB region, with spaces between words and each word capitalized.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PercentileMetric> listMetricsAsync(String resourceGroupName, String accountName, String targetRegion, String filter);

}
