// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsWorkspacesCloudResourceBucketArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesExternalCustomerInfoArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesNetworkArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesTokenArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsWorkspacesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesArgs Empty = new MwsWorkspacesArgs();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * AWS region of VPC
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return AWS region of VPC
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    @Import(name="cloudResourceBucket")
    private @Nullable Output<MwsWorkspacesCloudResourceBucketArgs> cloudResourceBucket;

    public Optional<Output<MwsWorkspacesCloudResourceBucketArgs>> cloudResourceBucket() {
        return Optional.ofNullable(this.cloudResourceBucket);
    }

    /**
     * (Integer) time when workspace was created
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<Integer> creationTime;

    /**
     * @return (Integer) time when workspace was created
     * 
     */
    public Optional<Output<Integer>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    @Import(name="credentialsId")
    private @Nullable Output<String> credentialsId;

    public Optional<Output<String>> credentialsId() {
        return Optional.ofNullable(this.credentialsId);
    }

    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    @Import(name="customerManagedKeyId")
    private @Nullable Output<String> customerManagedKeyId;

    /**
     * @deprecated
     * Use managed_services_customer_managed_key_id instead
     * 
     */
    @Deprecated /* Use managed_services_customer_managed_key_id instead */
    public Optional<Output<String>> customerManagedKeyId() {
        return Optional.ofNullable(this.customerManagedKeyId);
    }

    /**
     * part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    @Import(name="deploymentName")
    private @Nullable Output<String> deploymentName;

    /**
     * @return part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
     * 
     */
    public Optional<Output<String>> deploymentName() {
        return Optional.ofNullable(this.deploymentName);
    }

    @Import(name="externalCustomerInfo")
    private @Nullable Output<MwsWorkspacesExternalCustomerInfoArgs> externalCustomerInfo;

    public Optional<Output<MwsWorkspacesExternalCustomerInfoArgs>> externalCustomerInfo() {
        return Optional.ofNullable(this.externalCustomerInfo);
    }

    @Import(name="isNoPublicIpEnabled")
    private @Nullable Output<Boolean> isNoPublicIpEnabled;

    public Optional<Output<Boolean>> isNoPublicIpEnabled() {
        return Optional.ofNullable(this.isNoPublicIpEnabled);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    @Import(name="managedServicesCustomerManagedKeyId")
    private @Nullable Output<String> managedServicesCustomerManagedKeyId;

    /**
     * @return `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
     * 
     */
    public Optional<Output<String>> managedServicesCustomerManagedKeyId() {
        return Optional.ofNullable(this.managedServicesCustomerManagedKeyId);
    }

    @Import(name="network")
    private @Nullable Output<MwsWorkspacesNetworkArgs> network;

    public Optional<Output<MwsWorkspacesNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    @Import(name="pricingTier")
    private @Nullable Output<String> pricingTier;

    public Optional<Output<String>> pricingTier() {
        return Optional.ofNullable(this.pricingTier);
    }

    /**
     * Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
     * 
     */
    @Import(name="privateAccessSettingsId")
    private @Nullable Output<String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
     * 
     */
    public Optional<Output<String>> privateAccessSettingsId() {
        return Optional.ofNullable(this.privateAccessSettingsId);
    }

    /**
     * `storage_configuration_id` from storage configuration
     * 
     */
    @Import(name="storageConfigurationId")
    private @Nullable Output<String> storageConfigurationId;

    /**
     * @return `storage_configuration_id` from storage configuration
     * 
     */
    public Optional<Output<String>> storageConfigurationId() {
        return Optional.ofNullable(this.storageConfigurationId);
    }

    @Import(name="storageCustomerManagedKeyId")
    private @Nullable Output<String> storageCustomerManagedKeyId;

    public Optional<Output<String>> storageCustomerManagedKeyId() {
        return Optional.ofNullable(this.storageCustomerManagedKeyId);
    }

    @Import(name="token")
    private @Nullable Output<MwsWorkspacesTokenArgs> token;

    public Optional<Output<MwsWorkspacesTokenArgs>> token() {
        return Optional.ofNullable(this.token);
    }

    @Import(name="workspaceId")
    private @Nullable Output<Integer> workspaceId;

    public Optional<Output<Integer>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    /**
     * name of the workspace, will appear on UI
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return name of the workspace, will appear on UI
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    /**
     * (String) workspace status
     * 
     */
    @Import(name="workspaceStatus")
    private @Nullable Output<String> workspaceStatus;

    /**
     * @return (String) workspace status
     * 
     */
    public Optional<Output<String>> workspaceStatus() {
        return Optional.ofNullable(this.workspaceStatus);
    }

    /**
     * (String) updates on workspace status
     * 
     */
    @Import(name="workspaceStatusMessage")
    private @Nullable Output<String> workspaceStatusMessage;

    /**
     * @return (String) updates on workspace status
     * 
     */
    public Optional<Output<String>> workspaceStatusMessage() {
        return Optional.ofNullable(this.workspaceStatusMessage);
    }

    /**
     * (String) URL of the workspace
     * 
     */
    @Import(name="workspaceUrl")
    private @Nullable Output<String> workspaceUrl;

    /**
     * @return (String) URL of the workspace
     * 
     */
    public Optional<Output<String>> workspaceUrl() {
        return Optional.ofNullable(this.workspaceUrl);
    }

    private MwsWorkspacesArgs() {}

    private MwsWorkspacesArgs(MwsWorkspacesArgs $) {
        this.accountId = $.accountId;
        this.awsRegion = $.awsRegion;
        this.cloud = $.cloud;
        this.cloudResourceBucket = $.cloudResourceBucket;
        this.creationTime = $.creationTime;
        this.credentialsId = $.credentialsId;
        this.customerManagedKeyId = $.customerManagedKeyId;
        this.deploymentName = $.deploymentName;
        this.externalCustomerInfo = $.externalCustomerInfo;
        this.isNoPublicIpEnabled = $.isNoPublicIpEnabled;
        this.location = $.location;
        this.managedServicesCustomerManagedKeyId = $.managedServicesCustomerManagedKeyId;
        this.network = $.network;
        this.networkId = $.networkId;
        this.pricingTier = $.pricingTier;
        this.privateAccessSettingsId = $.privateAccessSettingsId;
        this.storageConfigurationId = $.storageConfigurationId;
        this.storageCustomerManagedKeyId = $.storageCustomerManagedKeyId;
        this.token = $.token;
        this.workspaceId = $.workspaceId;
        this.workspaceName = $.workspaceName;
        this.workspaceStatus = $.workspaceStatus;
        this.workspaceStatusMessage = $.workspaceStatusMessage;
        this.workspaceUrl = $.workspaceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesArgs $;

        public Builder() {
            $ = new MwsWorkspacesArgs();
        }

        public Builder(MwsWorkspacesArgs defaults) {
            $ = new MwsWorkspacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
         * 
         * @return builder
         * 
         */
        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param awsRegion AWS region of VPC
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion AWS region of VPC
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        public Builder cloudResourceBucket(@Nullable Output<MwsWorkspacesCloudResourceBucketArgs> cloudResourceBucket) {
            $.cloudResourceBucket = cloudResourceBucket;
            return this;
        }

        public Builder cloudResourceBucket(MwsWorkspacesCloudResourceBucketArgs cloudResourceBucket) {
            return cloudResourceBucket(Output.of(cloudResourceBucket));
        }

        /**
         * @param creationTime (Integer) time when workspace was created
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime (Integer) time when workspace was created
         * 
         * @return builder
         * 
         */
        public Builder creationTime(Integer creationTime) {
            return creationTime(Output.of(creationTime));
        }

        public Builder credentialsId(@Nullable Output<String> credentialsId) {
            $.credentialsId = credentialsId;
            return this;
        }

        public Builder credentialsId(String credentialsId) {
            return credentialsId(Output.of(credentialsId));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use managed_services_customer_managed_key_id instead
         * 
         */
        @Deprecated /* Use managed_services_customer_managed_key_id instead */
        public Builder customerManagedKeyId(@Nullable Output<String> customerManagedKeyId) {
            $.customerManagedKeyId = customerManagedKeyId;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Use managed_services_customer_managed_key_id instead
         * 
         */
        @Deprecated /* Use managed_services_customer_managed_key_id instead */
        public Builder customerManagedKeyId(String customerManagedKeyId) {
            return customerManagedKeyId(Output.of(customerManagedKeyId));
        }

        /**
         * @param deploymentName part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        public Builder externalCustomerInfo(@Nullable Output<MwsWorkspacesExternalCustomerInfoArgs> externalCustomerInfo) {
            $.externalCustomerInfo = externalCustomerInfo;
            return this;
        }

        public Builder externalCustomerInfo(MwsWorkspacesExternalCustomerInfoArgs externalCustomerInfo) {
            return externalCustomerInfo(Output.of(externalCustomerInfo));
        }

        public Builder isNoPublicIpEnabled(@Nullable Output<Boolean> isNoPublicIpEnabled) {
            $.isNoPublicIpEnabled = isNoPublicIpEnabled;
            return this;
        }

        public Builder isNoPublicIpEnabled(Boolean isNoPublicIpEnabled) {
            return isNoPublicIpEnabled(Output.of(isNoPublicIpEnabled));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedServicesCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCustomerManagedKeyId(@Nullable Output<String> managedServicesCustomerManagedKeyId) {
            $.managedServicesCustomerManagedKeyId = managedServicesCustomerManagedKeyId;
            return this;
        }

        /**
         * @param managedServicesCustomerManagedKeyId `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace&#39;s notebook and secret data in the control plane.
         * 
         * @return builder
         * 
         */
        public Builder managedServicesCustomerManagedKeyId(String managedServicesCustomerManagedKeyId) {
            return managedServicesCustomerManagedKeyId(Output.of(managedServicesCustomerManagedKeyId));
        }

        public Builder network(@Nullable Output<MwsWorkspacesNetworkArgs> network) {
            $.network = network;
            return this;
        }

        public Builder network(MwsWorkspacesNetworkArgs network) {
            return network(Output.of(network));
        }

        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public Builder pricingTier(@Nullable Output<String> pricingTier) {
            $.pricingTier = pricingTier;
            return this;
        }

        public Builder pricingTier(String pricingTier) {
            return pricingTier(Output.of(pricingTier));
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(@Nullable Output<String> privateAccessSettingsId) {
            $.privateAccessSettingsId = privateAccessSettingsId;
            return this;
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of databricks.MwsPrivateAccessSettings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(String privateAccessSettingsId) {
            return privateAccessSettingsId(Output.of(privateAccessSettingsId));
        }

        /**
         * @param storageConfigurationId `storage_configuration_id` from storage configuration
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(@Nullable Output<String> storageConfigurationId) {
            $.storageConfigurationId = storageConfigurationId;
            return this;
        }

        /**
         * @param storageConfigurationId `storage_configuration_id` from storage configuration
         * 
         * @return builder
         * 
         */
        public Builder storageConfigurationId(String storageConfigurationId) {
            return storageConfigurationId(Output.of(storageConfigurationId));
        }

        public Builder storageCustomerManagedKeyId(@Nullable Output<String> storageCustomerManagedKeyId) {
            $.storageCustomerManagedKeyId = storageCustomerManagedKeyId;
            return this;
        }

        public Builder storageCustomerManagedKeyId(String storageCustomerManagedKeyId) {
            return storageCustomerManagedKeyId(Output.of(storageCustomerManagedKeyId));
        }

        public Builder token(@Nullable Output<MwsWorkspacesTokenArgs> token) {
            $.token = token;
            return this;
        }

        public Builder token(MwsWorkspacesTokenArgs token) {
            return token(Output.of(token));
        }

        public Builder workspaceId(@Nullable Output<Integer> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(Integer workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        /**
         * @param workspaceName name of the workspace, will appear on UI
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName name of the workspace, will appear on UI
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        /**
         * @param workspaceStatus (String) workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatus(@Nullable Output<String> workspaceStatus) {
            $.workspaceStatus = workspaceStatus;
            return this;
        }

        /**
         * @param workspaceStatus (String) workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatus(String workspaceStatus) {
            return workspaceStatus(Output.of(workspaceStatus));
        }

        /**
         * @param workspaceStatusMessage (String) updates on workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatusMessage(@Nullable Output<String> workspaceStatusMessage) {
            $.workspaceStatusMessage = workspaceStatusMessage;
            return this;
        }

        /**
         * @param workspaceStatusMessage (String) updates on workspace status
         * 
         * @return builder
         * 
         */
        public Builder workspaceStatusMessage(String workspaceStatusMessage) {
            return workspaceStatusMessage(Output.of(workspaceStatusMessage));
        }

        /**
         * @param workspaceUrl (String) URL of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(@Nullable Output<String> workspaceUrl) {
            $.workspaceUrl = workspaceUrl;
            return this;
        }

        /**
         * @param workspaceUrl (String) URL of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceUrl(String workspaceUrl) {
            return workspaceUrl(Output.of(workspaceUrl));
        }

        public MwsWorkspacesArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
