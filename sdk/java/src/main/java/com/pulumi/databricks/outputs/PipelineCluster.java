// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.PipelineClusterAutoscale;
import com.pulumi.databricks.outputs.PipelineClusterAwsAttributes;
import com.pulumi.databricks.outputs.PipelineClusterClusterLogConf;
import com.pulumi.databricks.outputs.PipelineClusterGcpAttributes;
import com.pulumi.databricks.outputs.PipelineClusterInitScript;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineCluster {
    private final @Nullable Boolean applyPolicyDefaultValues;
    private final @Nullable PipelineClusterAutoscale autoscale;
    private final @Nullable PipelineClusterAwsAttributes awsAttributes;
    private final @Nullable PipelineClusterClusterLogConf clusterLogConf;
    private final @Nullable Map<String,Object> customTags;
    private final @Nullable String driverInstancePoolId;
    private final @Nullable String driverNodeTypeId;
    private final @Nullable PipelineClusterGcpAttributes gcpAttributes;
    private final @Nullable List<PipelineClusterInitScript> initScripts;
    private final @Nullable String instancePoolId;
    private final @Nullable String label;
    private final @Nullable String nodeTypeId;
    private final @Nullable Integer numWorkers;
    private final @Nullable String policyId;
    private final @Nullable Map<String,Object> sparkConf;
    private final @Nullable Map<String,Object> sparkEnvVars;
    private final @Nullable List<String> sshPublicKeys;

    @CustomType.Constructor
    private PipelineCluster(
        @CustomType.Parameter("applyPolicyDefaultValues") @Nullable Boolean applyPolicyDefaultValues,
        @CustomType.Parameter("autoscale") @Nullable PipelineClusterAutoscale autoscale,
        @CustomType.Parameter("awsAttributes") @Nullable PipelineClusterAwsAttributes awsAttributes,
        @CustomType.Parameter("clusterLogConf") @Nullable PipelineClusterClusterLogConf clusterLogConf,
        @CustomType.Parameter("customTags") @Nullable Map<String,Object> customTags,
        @CustomType.Parameter("driverInstancePoolId") @Nullable String driverInstancePoolId,
        @CustomType.Parameter("driverNodeTypeId") @Nullable String driverNodeTypeId,
        @CustomType.Parameter("gcpAttributes") @Nullable PipelineClusterGcpAttributes gcpAttributes,
        @CustomType.Parameter("initScripts") @Nullable List<PipelineClusterInitScript> initScripts,
        @CustomType.Parameter("instancePoolId") @Nullable String instancePoolId,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("nodeTypeId") @Nullable String nodeTypeId,
        @CustomType.Parameter("numWorkers") @Nullable Integer numWorkers,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("sparkConf") @Nullable Map<String,Object> sparkConf,
        @CustomType.Parameter("sparkEnvVars") @Nullable Map<String,Object> sparkEnvVars,
        @CustomType.Parameter("sshPublicKeys") @Nullable List<String> sshPublicKeys) {
        this.applyPolicyDefaultValues = applyPolicyDefaultValues;
        this.autoscale = autoscale;
        this.awsAttributes = awsAttributes;
        this.clusterLogConf = clusterLogConf;
        this.customTags = customTags;
        this.driverInstancePoolId = driverInstancePoolId;
        this.driverNodeTypeId = driverNodeTypeId;
        this.gcpAttributes = gcpAttributes;
        this.initScripts = initScripts;
        this.instancePoolId = instancePoolId;
        this.label = label;
        this.nodeTypeId = nodeTypeId;
        this.numWorkers = numWorkers;
        this.policyId = policyId;
        this.sparkConf = sparkConf;
        this.sparkEnvVars = sparkEnvVars;
        this.sshPublicKeys = sshPublicKeys;
    }

    public Optional<Boolean> applyPolicyDefaultValues() {
        return Optional.ofNullable(this.applyPolicyDefaultValues);
    }
    public Optional<PipelineClusterAutoscale> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }
    public Optional<PipelineClusterAwsAttributes> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }
    public Optional<PipelineClusterClusterLogConf> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }
    public Map<String,Object> customTags() {
        return this.customTags == null ? Map.of() : this.customTags;
    }
    public Optional<String> driverInstancePoolId() {
        return Optional.ofNullable(this.driverInstancePoolId);
    }
    public Optional<String> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }
    public Optional<PipelineClusterGcpAttributes> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }
    public List<PipelineClusterInitScript> initScripts() {
        return this.initScripts == null ? List.of() : this.initScripts;
    }
    public Optional<String> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<String> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }
    public Optional<Integer> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Map<String,Object> sparkConf() {
        return this.sparkConf == null ? Map.of() : this.sparkConf;
    }
    public Map<String,Object> sparkEnvVars() {
        return this.sparkEnvVars == null ? Map.of() : this.sparkEnvVars;
    }
    public List<String> sshPublicKeys() {
        return this.sshPublicKeys == null ? List.of() : this.sshPublicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean applyPolicyDefaultValues;
        private @Nullable PipelineClusterAutoscale autoscale;
        private @Nullable PipelineClusterAwsAttributes awsAttributes;
        private @Nullable PipelineClusterClusterLogConf clusterLogConf;
        private @Nullable Map<String,Object> customTags;
        private @Nullable String driverInstancePoolId;
        private @Nullable String driverNodeTypeId;
        private @Nullable PipelineClusterGcpAttributes gcpAttributes;
        private @Nullable List<PipelineClusterInitScript> initScripts;
        private @Nullable String instancePoolId;
        private @Nullable String label;
        private @Nullable String nodeTypeId;
        private @Nullable Integer numWorkers;
        private @Nullable String policyId;
        private @Nullable Map<String,Object> sparkConf;
        private @Nullable Map<String,Object> sparkEnvVars;
        private @Nullable List<String> sshPublicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyPolicyDefaultValues = defaults.applyPolicyDefaultValues;
    	      this.autoscale = defaults.autoscale;
    	      this.awsAttributes = defaults.awsAttributes;
    	      this.clusterLogConf = defaults.clusterLogConf;
    	      this.customTags = defaults.customTags;
    	      this.driverInstancePoolId = defaults.driverInstancePoolId;
    	      this.driverNodeTypeId = defaults.driverNodeTypeId;
    	      this.gcpAttributes = defaults.gcpAttributes;
    	      this.initScripts = defaults.initScripts;
    	      this.instancePoolId = defaults.instancePoolId;
    	      this.label = defaults.label;
    	      this.nodeTypeId = defaults.nodeTypeId;
    	      this.numWorkers = defaults.numWorkers;
    	      this.policyId = defaults.policyId;
    	      this.sparkConf = defaults.sparkConf;
    	      this.sparkEnvVars = defaults.sparkEnvVars;
    	      this.sshPublicKeys = defaults.sshPublicKeys;
        }

        public Builder applyPolicyDefaultValues(@Nullable Boolean applyPolicyDefaultValues) {
            this.applyPolicyDefaultValues = applyPolicyDefaultValues;
            return this;
        }
        public Builder autoscale(@Nullable PipelineClusterAutoscale autoscale) {
            this.autoscale = autoscale;
            return this;
        }
        public Builder awsAttributes(@Nullable PipelineClusterAwsAttributes awsAttributes) {
            this.awsAttributes = awsAttributes;
            return this;
        }
        public Builder clusterLogConf(@Nullable PipelineClusterClusterLogConf clusterLogConf) {
            this.clusterLogConf = clusterLogConf;
            return this;
        }
        public Builder customTags(@Nullable Map<String,Object> customTags) {
            this.customTags = customTags;
            return this;
        }
        public Builder driverInstancePoolId(@Nullable String driverInstancePoolId) {
            this.driverInstancePoolId = driverInstancePoolId;
            return this;
        }
        public Builder driverNodeTypeId(@Nullable String driverNodeTypeId) {
            this.driverNodeTypeId = driverNodeTypeId;
            return this;
        }
        public Builder gcpAttributes(@Nullable PipelineClusterGcpAttributes gcpAttributes) {
            this.gcpAttributes = gcpAttributes;
            return this;
        }
        public Builder initScripts(@Nullable List<PipelineClusterInitScript> initScripts) {
            this.initScripts = initScripts;
            return this;
        }
        public Builder initScripts(PipelineClusterInitScript... initScripts) {
            return initScripts(List.of(initScripts));
        }
        public Builder instancePoolId(@Nullable String instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder nodeTypeId(@Nullable String nodeTypeId) {
            this.nodeTypeId = nodeTypeId;
            return this;
        }
        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder sparkConf(@Nullable Map<String,Object> sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }
        public Builder sparkEnvVars(@Nullable Map<String,Object> sparkEnvVars) {
            this.sparkEnvVars = sparkEnvVars;
            return this;
        }
        public Builder sshPublicKeys(@Nullable List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            return this;
        }
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }        public PipelineCluster build() {
            return new PipelineCluster(applyPolicyDefaultValues, autoscale, awsAttributes, clusterLogConf, customTags, driverInstancePoolId, driverNodeTypeId, gcpAttributes, initScripts, instancePoolId, label, nodeTypeId, numWorkers, policyId, sparkConf, sparkEnvVars, sshPublicKeys);
        }
    }
}