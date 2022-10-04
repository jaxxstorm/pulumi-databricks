// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsLibraryMavenArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsLibraryMavenArgs Empty = new GetJobJobSettingsSettingsLibraryMavenArgs();

    @Import(name="coordinates", required=true)
    private Output<String> coordinates;

    public Output<String> coordinates() {
        return this.coordinates;
    }

    @Import(name="exclusions")
    private @Nullable Output<List<String>> exclusions;

    public Optional<Output<List<String>>> exclusions() {
        return Optional.ofNullable(this.exclusions);
    }

    @Import(name="repo")
    private @Nullable Output<String> repo;

    public Optional<Output<String>> repo() {
        return Optional.ofNullable(this.repo);
    }

    private GetJobJobSettingsSettingsLibraryMavenArgs() {}

    private GetJobJobSettingsSettingsLibraryMavenArgs(GetJobJobSettingsSettingsLibraryMavenArgs $) {
        this.coordinates = $.coordinates;
        this.exclusions = $.exclusions;
        this.repo = $.repo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsLibraryMavenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsLibraryMavenArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsLibraryMavenArgs();
        }

        public Builder(GetJobJobSettingsSettingsLibraryMavenArgs defaults) {
            $ = new GetJobJobSettingsSettingsLibraryMavenArgs(Objects.requireNonNull(defaults));
        }

        public Builder coordinates(Output<String> coordinates) {
            $.coordinates = coordinates;
            return this;
        }

        public Builder coordinates(String coordinates) {
            return coordinates(Output.of(coordinates));
        }

        public Builder exclusions(@Nullable Output<List<String>> exclusions) {
            $.exclusions = exclusions;
            return this;
        }

        public Builder exclusions(List<String> exclusions) {
            return exclusions(Output.of(exclusions));
        }

        public Builder exclusions(String... exclusions) {
            return exclusions(List.of(exclusions));
        }

        public Builder repo(@Nullable Output<String> repo) {
            $.repo = repo;
            return this;
        }

        public Builder repo(String repo) {
            return repo(Output.of(repo));
        }

        public GetJobJobSettingsSettingsLibraryMavenArgs build() {
            $.coordinates = Objects.requireNonNull($.coordinates, "expected parameter 'coordinates' to be non-null");
            return $;
        }
    }

}