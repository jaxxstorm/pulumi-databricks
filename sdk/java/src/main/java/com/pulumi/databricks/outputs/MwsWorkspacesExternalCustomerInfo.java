// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesExternalCustomerInfo {
    private String authoritativeUserEmail;
    private String authoritativeUserFullName;
    private String customerName;

    private MwsWorkspacesExternalCustomerInfo() {}
    public String authoritativeUserEmail() {
        return this.authoritativeUserEmail;
    }
    public String authoritativeUserFullName() {
        return this.authoritativeUserFullName;
    }
    public String customerName() {
        return this.customerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesExternalCustomerInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authoritativeUserEmail;
        private String authoritativeUserFullName;
        private String customerName;
        public Builder() {}
        public Builder(MwsWorkspacesExternalCustomerInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authoritativeUserEmail = defaults.authoritativeUserEmail;
    	      this.authoritativeUserFullName = defaults.authoritativeUserFullName;
    	      this.customerName = defaults.customerName;
        }

        @CustomType.Setter
        public Builder authoritativeUserEmail(String authoritativeUserEmail) {
            this.authoritativeUserEmail = Objects.requireNonNull(authoritativeUserEmail);
            return this;
        }
        @CustomType.Setter
        public Builder authoritativeUserFullName(String authoritativeUserFullName) {
            this.authoritativeUserFullName = Objects.requireNonNull(authoritativeUserFullName);
            return this;
        }
        @CustomType.Setter
        public Builder customerName(String customerName) {
            this.customerName = Objects.requireNonNull(customerName);
            return this;
        }
        public MwsWorkspacesExternalCustomerInfo build() {
            final var o = new MwsWorkspacesExternalCustomerInfo();
            o.authoritativeUserEmail = authoritativeUserEmail;
            o.authoritativeUserFullName = authoritativeUserFullName;
            o.customerName = customerName;
            return o;
        }
    }
}
