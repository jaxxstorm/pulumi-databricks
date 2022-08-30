// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GrantsGrant {
    private final String principal;
    private final List<String> privileges;

    @CustomType.Constructor
    private GrantsGrant(
        @CustomType.Parameter("principal") String principal,
        @CustomType.Parameter("privileges") List<String> privileges) {
        this.principal = principal;
        this.privileges = privileges;
    }

    public String principal() {
        return this.principal;
    }
    public List<String> privileges() {
        return this.privileges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrantsGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principal;
        private List<String> privileges;

        public Builder() {
    	      // Empty
        }

        public Builder(GrantsGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.privileges = defaults.privileges;
        }

        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder privileges(List<String> privileges) {
            this.privileges = Objects.requireNonNull(privileges);
            return this;
        }
        public Builder privileges(String... privileges) {
            return privileges(List.of(privileges));
        }        public GrantsGrant build() {
            return new GrantsGrant(principal, privileges);
        }
    }
}