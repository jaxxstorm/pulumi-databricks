// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClustersResult {
    private final @Nullable String clusterNameContains;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return list of databricks.Cluster ids
     * 
     */
    private final List<String> ids;

    @CustomType.Constructor
    private GetClustersResult(
        @CustomType.Parameter("clusterNameContains") @Nullable String clusterNameContains,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids) {
        this.clusterNameContains = clusterNameContains;
        this.id = id;
        this.ids = ids;
    }

    public Optional<String> clusterNameContains() {
        return Optional.ofNullable(this.clusterNameContains);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return list of databricks.Cluster ids
     * 
     */
    public List<String> ids() {
        return this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterNameContains;
        private String id;
        private List<String> ids;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNameContains = defaults.clusterNameContains;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
        }

        public Builder clusterNameContains(@Nullable String clusterNameContains) {
            this.clusterNameContains = clusterNameContains;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }        public GetClustersResult build() {
            return new GetClustersResult(clusterNameContains, id, ids);
        }
    }
}