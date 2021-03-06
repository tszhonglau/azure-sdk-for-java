/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_04_04;

import rx.Completable;
import rx.Observable;

/**
 * Type representing PolicyStates.
 */
public interface PolicyStates {
    /**
     * Queries policy states for the resources under the management group.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param managementGroupName Management group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForManagementGroupAsync(PolicyStatesResource policyStatesResource, String managementGroupName);

    /**
     * Summarizes policy states for the resources under the management group.
     *
     * @param managementGroupName Management group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForManagementGroupAsync(String managementGroupName);

    /**
     * Queries policy states for the resources under the subscription.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForSubscriptionAsync(PolicyStatesResource policyStatesResource, String subscriptionId);

    /**
     * Summarizes policy states for the resources under the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForSubscriptionAsync(String subscriptionId);

    /**
     * Queries policy states for the resources under the resource group.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForResourceGroupAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String resourceGroupName);

    /**
     * Summarizes policy states for the resources under the resource group.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForResourceGroupAsync(String subscriptionId, String resourceGroupName);

    /**
     * Queries policy states for the resource.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForResourceAsync(PolicyStatesResource policyStatesResource, String resourceId);

    /**
     * Summarizes policy states for the resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForResourceAsync(String resourceId);

    /**
     * Queries policy states for the subscription level policy set definition.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policySetDefinitionName Policy set definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForPolicySetDefinitionAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policySetDefinitionName);

    /**
     * Summarizes policy states for the subscription level policy set definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policySetDefinitionName Policy set definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForPolicySetDefinitionAsync(String subscriptionId, String policySetDefinitionName);

    /**
     * Queries policy states for the subscription level policy definition.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyDefinitionName Policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForPolicyDefinitionAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policyDefinitionName);

    /**
     * Summarizes policy states for the subscription level policy definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyDefinitionName Policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForPolicyDefinitionAsync(String subscriptionId, String policyDefinitionName);

    /**
     * Queries policy states for the subscription level policy assignment.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String policyAssignmentName);

    /**
     * Summarizes policy states for the subscription level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForSubscriptionLevelPolicyAssignmentAsync(String subscriptionId, String policyAssignmentName);

    /**
     * Queries policy states for the resource group level policy assignment.
     *
     * @param policyStatesResource The virtual resource under PolicyStates resource type. In a given time range, 'latest' represents the latest policy state(s), whereas 'default' represents all policy state(s). Possible values include: 'default', 'latest'
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyStatesQueryResults> listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(PolicyStatesResource policyStatesResource, String subscriptionId, String resourceGroupName, String policyAssignmentName);

    /**
     * Summarizes policy states for the resource group level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SummarizeResults> summarizeForResourceGroupLevelPolicyAssignmentAsync(String subscriptionId, String resourceGroupName, String policyAssignmentName);

    /**
     * Gets OData metadata XML document.
     *
     * @param scope A valid scope, i.e. management group, subscription, resource group, or resource ID. Scope used has no effect on metadata returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getMetadataAsync(String scope);

}
