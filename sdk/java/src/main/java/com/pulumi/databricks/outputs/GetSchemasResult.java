// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSchemasResult {
    private String catalogName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return set of databricks.Schema full names: *`catalog`.`schema`*
     * 
     */
    private List<String> ids;

    private GetSchemasResult() {}
    public String catalogName() {
        return this.catalogName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return set of databricks.Schema full names: *`catalog`.`schema`*
     * 
     */
    public List<String> ids() {
        return this.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String catalogName;
        private String id;
        private List<String> ids;
        public Builder() {}
        public Builder(GetSchemasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogName = defaults.catalogName;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
        }

        @CustomType.Setter
        public Builder catalogName(String catalogName) {
            this.catalogName = Objects.requireNonNull(catalogName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public GetSchemasResult build() {
            final var o = new GetSchemasResult();
            o.catalogName = catalogName;
            o.id = id;
            o.ids = ids;
            return o;
        }
    }
}
