// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogsPlainArgs Empty = new GetCatalogsPlainArgs();

    /**
     * set of databricks.Catalog names
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return set of databricks.Catalog names
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetCatalogsPlainArgs() {}

    private GetCatalogsPlainArgs(GetCatalogsPlainArgs $) {
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogsPlainArgs $;

        public Builder() {
            $ = new GetCatalogsPlainArgs();
        }

        public Builder(GetCatalogsPlainArgs defaults) {
            $ = new GetCatalogsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids set of databricks.Catalog names
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids set of databricks.Catalog names
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public GetCatalogsPlainArgs build() {
            return $;
        }
    }

}
