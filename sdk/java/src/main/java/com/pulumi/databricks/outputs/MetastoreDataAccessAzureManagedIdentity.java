// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetastoreDataAccessAzureManagedIdentity {
    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     */
    private String accessConnectorId;

    private MetastoreDataAccessAzureManagedIdentity() {}
    /**
     * @return The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
     * 
     */
    public String accessConnectorId() {
        return this.accessConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreDataAccessAzureManagedIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessConnectorId;
        public Builder() {}
        public Builder(MetastoreDataAccessAzureManagedIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConnectorId = defaults.accessConnectorId;
        }

        @CustomType.Setter
        public Builder accessConnectorId(String accessConnectorId) {
            this.accessConnectorId = Objects.requireNonNull(accessConnectorId);
            return this;
        }
        public MetastoreDataAccessAzureManagedIdentity build() {
            final var o = new MetastoreDataAccessAzureManagedIdentity();
            o.accessConnectorId = accessConnectorId;
            return o;
        }
    }
}
