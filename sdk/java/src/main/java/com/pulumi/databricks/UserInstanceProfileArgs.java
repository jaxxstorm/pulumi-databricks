// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UserInstanceProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserInstanceProfileArgs Empty = new UserInstanceProfileArgs();

    /**
     * This is the id of the instance profile resource.
     * 
     */
    @Import(name="instanceProfileId", required=true)
    private Output<String> instanceProfileId;

    /**
     * @return This is the id of the instance profile resource.
     * 
     */
    public Output<String> instanceProfileId() {
        return this.instanceProfileId;
    }

    /**
     * This is the id of the user resource.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return This is the id of the user resource.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserInstanceProfileArgs() {}

    private UserInstanceProfileArgs(UserInstanceProfileArgs $) {
        this.instanceProfileId = $.instanceProfileId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserInstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserInstanceProfileArgs $;

        public Builder() {
            $ = new UserInstanceProfileArgs();
        }

        public Builder(UserInstanceProfileArgs defaults) {
            $ = new UserInstanceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceProfileId This is the id of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileId(Output<String> instanceProfileId) {
            $.instanceProfileId = instanceProfileId;
            return this;
        }

        /**
         * @param instanceProfileId This is the id of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileId(String instanceProfileId) {
            return instanceProfileId(Output.of(instanceProfileId));
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId This is the id of the user resource.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserInstanceProfileArgs build() {
            $.instanceProfileId = Objects.requireNonNull($.instanceProfileId, "expected parameter 'instanceProfileId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
