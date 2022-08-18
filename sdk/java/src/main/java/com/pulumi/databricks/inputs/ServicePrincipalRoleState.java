// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePrincipalRoleState extends com.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalRoleState Empty = new ServicePrincipalRoleState();

    /**
     * This is the id of the role or instance profile resource.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return This is the id of the role or instance profile resource.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * This is the id of the service principal resource.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<String> servicePrincipalId;

    /**
     * @return This is the id of the service principal resource.
     * 
     */
    public Optional<Output<String>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    private ServicePrincipalRoleState() {}

    private ServicePrincipalRoleState(ServicePrincipalRoleState $) {
        this.role = $.role;
        this.servicePrincipalId = $.servicePrincipalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePrincipalRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePrincipalRoleState $;

        public Builder() {
            $ = new ServicePrincipalRoleState();
        }

        public Builder(ServicePrincipalRoleState defaults) {
            $ = new ServicePrincipalRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param role This is the id of the role or instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role This is the id of the role or instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param servicePrincipalId This is the id of the service principal resource.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId This is the id of the service principal resource.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public ServicePrincipalRoleState build() {
            return $;
        }
    }

}
