// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupInstanceProfileState extends com.pulumi.resources.ResourceArgs {

    public static final GroupInstanceProfileState Empty = new GroupInstanceProfileState();

    /**
     * This is the id of the group resource.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return This is the id of the group resource.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * This is the id of the instance profile resource.
     * 
     */
    @Import(name="instanceProfileId")
    private @Nullable Output<String> instanceProfileId;

    /**
     * @return This is the id of the instance profile resource.
     * 
     */
    public Optional<Output<String>> instanceProfileId() {
        return Optional.ofNullable(this.instanceProfileId);
    }

    private GroupInstanceProfileState() {}

    private GroupInstanceProfileState(GroupInstanceProfileState $) {
        this.groupId = $.groupId;
        this.instanceProfileId = $.instanceProfileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupInstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupInstanceProfileState $;

        public Builder() {
            $ = new GroupInstanceProfileState();
        }

        public Builder(GroupInstanceProfileState defaults) {
            $ = new GroupInstanceProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId This is the id of the group resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId This is the id of the group resource.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param instanceProfileId This is the id of the instance profile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfileId(@Nullable Output<String> instanceProfileId) {
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

        public GroupInstanceProfileState build() {
            return $;
        }
    }

}