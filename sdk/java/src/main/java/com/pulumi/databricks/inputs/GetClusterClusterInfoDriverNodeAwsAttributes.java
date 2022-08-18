// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoDriverNodeAwsAttributes extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterInfoDriverNodeAwsAttributes Empty = new GetClusterClusterInfoDriverNodeAwsAttributes();

    @Import(name="isSpot")
    private @Nullable Boolean isSpot;

    public Optional<Boolean> isSpot() {
        return Optional.ofNullable(this.isSpot);
    }

    private GetClusterClusterInfoDriverNodeAwsAttributes() {}

    private GetClusterClusterInfoDriverNodeAwsAttributes(GetClusterClusterInfoDriverNodeAwsAttributes $) {
        this.isSpot = $.isSpot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoDriverNodeAwsAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoDriverNodeAwsAttributes $;

        public Builder() {
            $ = new GetClusterClusterInfoDriverNodeAwsAttributes();
        }

        public Builder(GetClusterClusterInfoDriverNodeAwsAttributes defaults) {
            $ = new GetClusterClusterInfoDriverNodeAwsAttributes(Objects.requireNonNull(defaults));
        }

        public Builder isSpot(@Nullable Boolean isSpot) {
            $.isSpot = isSpot;
            return this;
        }

        public GetClusterClusterInfoDriverNodeAwsAttributes build() {
            return $;
        }
    }

}
