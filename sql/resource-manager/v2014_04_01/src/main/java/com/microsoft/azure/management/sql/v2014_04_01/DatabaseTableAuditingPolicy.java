/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.DatabaseTableAuditingPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import java.util.UUID;

/**
 * Type representing DatabaseTableAuditingPolicy.
 */
public interface DatabaseTableAuditingPolicy extends HasInner<DatabaseTableAuditingPolicyInner>, Indexable, Refreshable<DatabaseTableAuditingPolicy>, Updatable<DatabaseTableAuditingPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the auditingState value.
     */
    String auditingState();

    /**
     * @return the auditLogsTableName value.
     */
    String auditLogsTableName();

    /**
     * @return the eventTypesToAudit value.
     */
    String eventTypesToAudit();

    /**
     * @return the fullAuditLogsTableName value.
     */
    String fullAuditLogsTableName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the retentionDays value.
     */
    String retentionDays();

    /**
     * @return the storageAccountKey value.
     */
    String storageAccountKey();

    /**
     * @return the storageAccountName value.
     */
    String storageAccountName();

    /**
     * @return the storageAccountResourceGroupName value.
     */
    String storageAccountResourceGroupName();

    /**
     * @return the storageAccountSecondaryKey value.
     */
    String storageAccountSecondaryKey();

    /**
     * @return the storageAccountSubscriptionId value.
     */
    UUID storageAccountSubscriptionId();

    /**
     * @return the storageTableEndpoint value.
     */
    String storageTableEndpoint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the useServerDefault value.
     */
    String useServerDefault();

    /**
     * The entirety of the DatabaseTableAuditingPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatabaseTableAuditingPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatabaseTableAuditingPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param databaseName The name of the database for which the table auditing policy will be defined
            * @return the next definition stage
            */
            WithCreate withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify AuditingState.
         */
        interface WithAuditingState {
            /**
             * Specifies auditingState.
             * @param auditingState The state of the policy
             * @return the next definition stage
             */
            WithCreate withAuditingState(String auditingState);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify AuditLogsTableName.
         */
        interface WithAuditLogsTableName {
            /**
             * Specifies auditLogsTableName.
             * @param auditLogsTableName The audit logs table name
             * @return the next definition stage
             */
            WithCreate withAuditLogsTableName(String auditLogsTableName);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify EventTypesToAudit.
         */
        interface WithEventTypesToAudit {
            /**
             * Specifies eventTypesToAudit.
             * @param eventTypesToAudit Comma-separated list of event types to audit
             * @return the next definition stage
             */
            WithCreate withEventTypesToAudit(String eventTypesToAudit);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify FullAuditLogsTableName.
         */
        interface WithFullAuditLogsTableName {
            /**
             * Specifies fullAuditLogsTableName.
             * @param fullAuditLogsTableName The full audit logs table name
             * @return the next definition stage
             */
            WithCreate withFullAuditLogsTableName(String fullAuditLogsTableName);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays The number of days to keep in the audit logs
             * @return the next definition stage
             */
            WithCreate withRetentionDays(String retentionDays);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageAccountKey.
         */
        interface WithStorageAccountKey {
            /**
             * Specifies storageAccountKey.
             * @param storageAccountKey The key of the auditing storage account
             * @return the next definition stage
             */
            WithCreate withStorageAccountKey(String storageAccountKey);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             * @param storageAccountName The table storage account name
             * @return the next definition stage
             */
            WithCreate withStorageAccountName(String storageAccountName);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageAccountResourceGroupName.
         */
        interface WithStorageAccountResourceGroupName {
            /**
             * Specifies storageAccountResourceGroupName.
             * @param storageAccountResourceGroupName The table storage account resource group name
             * @return the next definition stage
             */
            WithCreate withStorageAccountResourceGroupName(String storageAccountResourceGroupName);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageAccountSecondaryKey.
         */
        interface WithStorageAccountSecondaryKey {
            /**
             * Specifies storageAccountSecondaryKey.
             * @param storageAccountSecondaryKey The secondary key of the auditing storage account
             * @return the next definition stage
             */
            WithCreate withStorageAccountSecondaryKey(String storageAccountSecondaryKey);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             * @param storageAccountSubscriptionId The table storage subscription Id
             * @return the next definition stage
             */
            WithCreate withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify StorageTableEndpoint.
         */
        interface WithStorageTableEndpoint {
            /**
             * Specifies storageTableEndpoint.
             * @param storageTableEndpoint The storage table endpoint
             * @return the next definition stage
             */
            WithCreate withStorageTableEndpoint(String storageTableEndpoint);
        }

        /**
         * The stage of the databasetableauditingpolicy definition allowing to specify UseServerDefault.
         */
        interface WithUseServerDefault {
            /**
             * Specifies useServerDefault.
             * @param useServerDefault Whether server default is enabled or disabled
             * @return the next definition stage
             */
            WithCreate withUseServerDefault(String useServerDefault);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatabaseTableAuditingPolicy>, DefinitionStages.WithAuditingState, DefinitionStages.WithAuditLogsTableName, DefinitionStages.WithEventTypesToAudit, DefinitionStages.WithFullAuditLogsTableName, DefinitionStages.WithRetentionDays, DefinitionStages.WithStorageAccountKey, DefinitionStages.WithStorageAccountName, DefinitionStages.WithStorageAccountResourceGroupName, DefinitionStages.WithStorageAccountSecondaryKey, DefinitionStages.WithStorageAccountSubscriptionId, DefinitionStages.WithStorageTableEndpoint, DefinitionStages.WithUseServerDefault {
        }
    }
    /**
     * The template for a DatabaseTableAuditingPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatabaseTableAuditingPolicy>, UpdateStages.WithAuditingState, UpdateStages.WithAuditLogsTableName, UpdateStages.WithEventTypesToAudit, UpdateStages.WithFullAuditLogsTableName, UpdateStages.WithRetentionDays, UpdateStages.WithStorageAccountKey, UpdateStages.WithStorageAccountName, UpdateStages.WithStorageAccountResourceGroupName, UpdateStages.WithStorageAccountSecondaryKey, UpdateStages.WithStorageAccountSubscriptionId, UpdateStages.WithStorageTableEndpoint, UpdateStages.WithUseServerDefault {
    }

    /**
     * Grouping of DatabaseTableAuditingPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the databasetableauditingpolicy update allowing to specify AuditingState.
         */
        interface WithAuditingState {
            /**
             * Specifies auditingState.
             * @param auditingState The state of the policy
             * @return the next update stage
             */
            Update withAuditingState(String auditingState);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify AuditLogsTableName.
         */
        interface WithAuditLogsTableName {
            /**
             * Specifies auditLogsTableName.
             * @param auditLogsTableName The audit logs table name
             * @return the next update stage
             */
            Update withAuditLogsTableName(String auditLogsTableName);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify EventTypesToAudit.
         */
        interface WithEventTypesToAudit {
            /**
             * Specifies eventTypesToAudit.
             * @param eventTypesToAudit Comma-separated list of event types to audit
             * @return the next update stage
             */
            Update withEventTypesToAudit(String eventTypesToAudit);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify FullAuditLogsTableName.
         */
        interface WithFullAuditLogsTableName {
            /**
             * Specifies fullAuditLogsTableName.
             * @param fullAuditLogsTableName The full audit logs table name
             * @return the next update stage
             */
            Update withFullAuditLogsTableName(String fullAuditLogsTableName);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify RetentionDays.
         */
        interface WithRetentionDays {
            /**
             * Specifies retentionDays.
             * @param retentionDays The number of days to keep in the audit logs
             * @return the next update stage
             */
            Update withRetentionDays(String retentionDays);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageAccountKey.
         */
        interface WithStorageAccountKey {
            /**
             * Specifies storageAccountKey.
             * @param storageAccountKey The key of the auditing storage account
             * @return the next update stage
             */
            Update withStorageAccountKey(String storageAccountKey);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageAccountName.
         */
        interface WithStorageAccountName {
            /**
             * Specifies storageAccountName.
             * @param storageAccountName The table storage account name
             * @return the next update stage
             */
            Update withStorageAccountName(String storageAccountName);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageAccountResourceGroupName.
         */
        interface WithStorageAccountResourceGroupName {
            /**
             * Specifies storageAccountResourceGroupName.
             * @param storageAccountResourceGroupName The table storage account resource group name
             * @return the next update stage
             */
            Update withStorageAccountResourceGroupName(String storageAccountResourceGroupName);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageAccountSecondaryKey.
         */
        interface WithStorageAccountSecondaryKey {
            /**
             * Specifies storageAccountSecondaryKey.
             * @param storageAccountSecondaryKey The secondary key of the auditing storage account
             * @return the next update stage
             */
            Update withStorageAccountSecondaryKey(String storageAccountSecondaryKey);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageAccountSubscriptionId.
         */
        interface WithStorageAccountSubscriptionId {
            /**
             * Specifies storageAccountSubscriptionId.
             * @param storageAccountSubscriptionId The table storage subscription Id
             * @return the next update stage
             */
            Update withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify StorageTableEndpoint.
         */
        interface WithStorageTableEndpoint {
            /**
             * Specifies storageTableEndpoint.
             * @param storageTableEndpoint The storage table endpoint
             * @return the next update stage
             */
            Update withStorageTableEndpoint(String storageTableEndpoint);
        }

        /**
         * The stage of the databasetableauditingpolicy update allowing to specify UseServerDefault.
         */
        interface WithUseServerDefault {
            /**
             * Specifies useServerDefault.
             * @param useServerDefault Whether server default is enabled or disabled
             * @return the next update stage
             */
            Update withUseServerDefault(String useServerDefault);
        }

    }
}