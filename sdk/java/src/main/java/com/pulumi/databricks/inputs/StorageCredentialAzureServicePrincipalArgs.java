// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StorageCredentialAzureServicePrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageCredentialAzureServicePrincipalArgs Empty = new StorageCredentialAzureServicePrincipalArgs();

    /**
     * The application ID of the application registration within the referenced AAD tenant
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return The application ID of the application registration within the referenced AAD tenant
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret generated for the above app ID in AAD. **This field is redacted on output**
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    private StorageCredentialAzureServicePrincipalArgs() {}

    private StorageCredentialAzureServicePrincipalArgs(StorageCredentialAzureServicePrincipalArgs $) {
        this.applicationId = $.applicationId;
        this.clientSecret = $.clientSecret;
        this.directoryId = $.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCredentialAzureServicePrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCredentialAzureServicePrincipalArgs $;

        public Builder() {
            $ = new StorageCredentialAzureServicePrincipalArgs();
        }

        public Builder(StorageCredentialAzureServicePrincipalArgs defaults) {
            $ = new StorageCredentialAzureServicePrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID of the application registration within the referenced AAD tenant
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The application ID of the application registration within the referenced AAD tenant
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param clientSecret The client secret generated for the above app ID in AAD. **This field is redacted on output**
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret generated for the above app ID in AAD. **This field is redacted on output**
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param directoryId The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        public StorageCredentialAzureServicePrincipalArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            return $;
        }
    }

}