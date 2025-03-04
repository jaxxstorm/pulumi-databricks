// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    @Import(name="authType")
    private @Nullable Output<String> authType;

    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    @Import(name="azureClientId")
    private @Nullable Output<String> azureClientId;

    public Optional<Output<String>> azureClientId() {
        return Optional.ofNullable(this.azureClientId);
    }

    @Import(name="azureClientSecret")
    private @Nullable Output<String> azureClientSecret;

    public Optional<Output<String>> azureClientSecret() {
        return Optional.ofNullable(this.azureClientSecret);
    }

    @Import(name="azureEnvironment")
    private @Nullable Output<String> azureEnvironment;

    public Optional<Output<String>> azureEnvironment() {
        return Optional.ofNullable(this.azureEnvironment);
    }

    @Import(name="azureLoginAppId")
    private @Nullable Output<String> azureLoginAppId;

    public Optional<Output<String>> azureLoginAppId() {
        return Optional.ofNullable(this.azureLoginAppId);
    }

    @Import(name="azureTenantId")
    private @Nullable Output<String> azureTenantId;

    public Optional<Output<String>> azureTenantId() {
        return Optional.ofNullable(this.azureTenantId);
    }

    @Import(name="azureUseMsi", json=true)
    private @Nullable Output<Boolean> azureUseMsi;

    public Optional<Output<Boolean>> azureUseMsi() {
        return Optional.ofNullable(this.azureUseMsi);
    }

    @Import(name="azureWorkspaceResourceId")
    private @Nullable Output<String> azureWorkspaceResourceId;

    public Optional<Output<String>> azureWorkspaceResourceId() {
        return Optional.ofNullable(this.azureWorkspaceResourceId);
    }

    @Import(name="configFile")
    private @Nullable Output<String> configFile;

    public Optional<Output<String>> configFile() {
        return Optional.ofNullable(this.configFile);
    }

    @Import(name="debugHeaders", json=true)
    private @Nullable Output<Boolean> debugHeaders;

    public Optional<Output<Boolean>> debugHeaders() {
        return Optional.ofNullable(this.debugHeaders);
    }

    @Import(name="debugTruncateBytes", json=true)
    private @Nullable Output<Integer> debugTruncateBytes;

    public Optional<Output<Integer>> debugTruncateBytes() {
        return Optional.ofNullable(this.debugTruncateBytes);
    }

    @Import(name="googleCredentials")
    private @Nullable Output<String> googleCredentials;

    public Optional<Output<String>> googleCredentials() {
        return Optional.ofNullable(this.googleCredentials);
    }

    @Import(name="googleServiceAccount")
    private @Nullable Output<String> googleServiceAccount;

    public Optional<Output<String>> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }

    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="httpTimeoutSeconds", json=true)
    private @Nullable Output<Integer> httpTimeoutSeconds;

    public Optional<Output<Integer>> httpTimeoutSeconds() {
        return Optional.ofNullable(this.httpTimeoutSeconds);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="profile")
    private @Nullable Output<String> profile;

    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    @Import(name="rateLimit", json=true)
    private @Nullable Output<Integer> rateLimit;

    public Optional<Output<Integer>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    @Import(name="skipVerify", json=true)
    private @Nullable Output<Boolean> skipVerify;

    public Optional<Output<Boolean>> skipVerify() {
        return Optional.ofNullable(this.skipVerify);
    }

    @Import(name="token")
    private @Nullable Output<String> token;

    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.accountId = $.accountId;
        this.authType = $.authType;
        this.azureClientId = $.azureClientId;
        this.azureClientSecret = $.azureClientSecret;
        this.azureEnvironment = $.azureEnvironment;
        this.azureLoginAppId = $.azureLoginAppId;
        this.azureTenantId = $.azureTenantId;
        this.azureUseMsi = $.azureUseMsi;
        this.azureWorkspaceResourceId = $.azureWorkspaceResourceId;
        this.configFile = $.configFile;
        this.debugHeaders = $.debugHeaders;
        this.debugTruncateBytes = $.debugTruncateBytes;
        this.googleCredentials = $.googleCredentials;
        this.googleServiceAccount = $.googleServiceAccount;
        this.host = $.host;
        this.httpTimeoutSeconds = $.httpTimeoutSeconds;
        this.password = $.password;
        this.profile = $.profile;
        this.rateLimit = $.rateLimit;
        this.skipVerify = $.skipVerify;
        this.token = $.token;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder azureClientId(@Nullable Output<String> azureClientId) {
            $.azureClientId = azureClientId;
            return this;
        }

        public Builder azureClientId(String azureClientId) {
            return azureClientId(Output.of(azureClientId));
        }

        public Builder azureClientSecret(@Nullable Output<String> azureClientSecret) {
            $.azureClientSecret = azureClientSecret;
            return this;
        }

        public Builder azureClientSecret(String azureClientSecret) {
            return azureClientSecret(Output.of(azureClientSecret));
        }

        public Builder azureEnvironment(@Nullable Output<String> azureEnvironment) {
            $.azureEnvironment = azureEnvironment;
            return this;
        }

        public Builder azureEnvironment(String azureEnvironment) {
            return azureEnvironment(Output.of(azureEnvironment));
        }

        public Builder azureLoginAppId(@Nullable Output<String> azureLoginAppId) {
            $.azureLoginAppId = azureLoginAppId;
            return this;
        }

        public Builder azureLoginAppId(String azureLoginAppId) {
            return azureLoginAppId(Output.of(azureLoginAppId));
        }

        public Builder azureTenantId(@Nullable Output<String> azureTenantId) {
            $.azureTenantId = azureTenantId;
            return this;
        }

        public Builder azureTenantId(String azureTenantId) {
            return azureTenantId(Output.of(azureTenantId));
        }

        public Builder azureUseMsi(@Nullable Output<Boolean> azureUseMsi) {
            $.azureUseMsi = azureUseMsi;
            return this;
        }

        public Builder azureUseMsi(Boolean azureUseMsi) {
            return azureUseMsi(Output.of(azureUseMsi));
        }

        public Builder azureWorkspaceResourceId(@Nullable Output<String> azureWorkspaceResourceId) {
            $.azureWorkspaceResourceId = azureWorkspaceResourceId;
            return this;
        }

        public Builder azureWorkspaceResourceId(String azureWorkspaceResourceId) {
            return azureWorkspaceResourceId(Output.of(azureWorkspaceResourceId));
        }

        public Builder configFile(@Nullable Output<String> configFile) {
            $.configFile = configFile;
            return this;
        }

        public Builder configFile(String configFile) {
            return configFile(Output.of(configFile));
        }

        public Builder debugHeaders(@Nullable Output<Boolean> debugHeaders) {
            $.debugHeaders = debugHeaders;
            return this;
        }

        public Builder debugHeaders(Boolean debugHeaders) {
            return debugHeaders(Output.of(debugHeaders));
        }

        public Builder debugTruncateBytes(@Nullable Output<Integer> debugTruncateBytes) {
            $.debugTruncateBytes = debugTruncateBytes;
            return this;
        }

        public Builder debugTruncateBytes(Integer debugTruncateBytes) {
            return debugTruncateBytes(Output.of(debugTruncateBytes));
        }

        public Builder googleCredentials(@Nullable Output<String> googleCredentials) {
            $.googleCredentials = googleCredentials;
            return this;
        }

        public Builder googleCredentials(String googleCredentials) {
            return googleCredentials(Output.of(googleCredentials));
        }

        public Builder googleServiceAccount(@Nullable Output<String> googleServiceAccount) {
            $.googleServiceAccount = googleServiceAccount;
            return this;
        }

        public Builder googleServiceAccount(String googleServiceAccount) {
            return googleServiceAccount(Output.of(googleServiceAccount));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder httpTimeoutSeconds(@Nullable Output<Integer> httpTimeoutSeconds) {
            $.httpTimeoutSeconds = httpTimeoutSeconds;
            return this;
        }

        public Builder httpTimeoutSeconds(Integer httpTimeoutSeconds) {
            return httpTimeoutSeconds(Output.of(httpTimeoutSeconds));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        public Builder rateLimit(@Nullable Output<Integer> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        public Builder rateLimit(Integer rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public Builder skipVerify(@Nullable Output<Boolean> skipVerify) {
            $.skipVerify = skipVerify;
            return this;
        }

        public Builder skipVerify(Boolean skipVerify) {
            return skipVerify(Output.of(skipVerify));
        }

        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
