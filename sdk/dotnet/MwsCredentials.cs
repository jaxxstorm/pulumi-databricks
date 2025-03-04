// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// &gt; **Note** This resource has an evolving API, which may change in future versions of the provider.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var databricksAccountId = config.RequireObject&lt;dynamic&gt;("databricksAccountId");
    ///     var thisAwsAssumeRolePolicy = Databricks.GetAwsAssumeRolePolicy.Invoke(new()
    ///     {
    ///         ExternalId = databricksAccountId,
    ///     });
    /// 
    ///     var crossAccountRole = new Aws.Iam.Role("crossAccountRole", new()
    ///     {
    ///         AssumeRolePolicy = thisAwsAssumeRolePolicy.Apply(getAwsAssumeRolePolicyResult =&gt; getAwsAssumeRolePolicyResult.Json),
    ///         Tags = @var.Tags,
    ///     });
    /// 
    ///     var thisAwsCrossAccountPolicy = Databricks.GetAwsCrossAccountPolicy.Invoke();
    /// 
    ///     var thisRolePolicy = new Aws.Iam.RolePolicy("thisRolePolicy", new()
    ///     {
    ///         Role = crossAccountRole.Id,
    ///         Policy = thisAwsCrossAccountPolicy.Apply(getAwsCrossAccountPolicyResult =&gt; getAwsCrossAccountPolicyResult.Json),
    ///     });
    /// 
    ///     var thisMwsCredentials = new Databricks.MwsCredentials("thisMwsCredentials", new()
    ///     {
    ///         AccountId = databricksAccountId,
    ///         CredentialsName = $"{local.Prefix}-creds",
    ///         RoleArn = crossAccountRole.Arn,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = databricks.Mws,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * Provisioning Databricks on AWS guide.
    /// * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
    /// * databricks.MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
    /// * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
    /// * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
    /// * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsCredentials:MwsCredentials")]
    public partial class MwsCredentials : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// (Integer) time of credentials registration
        /// </summary>
        [Output("creationTime")]
        public Output<int> CreationTime { get; private set; } = null!;

        /// <summary>
        /// (String) identifier of credentials
        /// </summary>
        [Output("credentialsId")]
        public Output<string> CredentialsId { get; private set; } = null!;

        /// <summary>
        /// name of credentials to register
        /// </summary>
        [Output("credentialsName")]
        public Output<string> CredentialsName { get; private set; } = null!;

        [Output("externalId")]
        public Output<string> ExternalId { get; private set; } = null!;

        /// <summary>
        /// ARN of cross-account role
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;


        /// <summary>
        /// Create a MwsCredentials resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsCredentials(string name, MwsCredentialsArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsCredentials:MwsCredentials", name, args ?? new MwsCredentialsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsCredentials(string name, Input<string> id, MwsCredentialsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsCredentials:MwsCredentials", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsCredentials resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsCredentials Get(string name, Input<string> id, MwsCredentialsState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsCredentials(name, id, state, options);
        }
    }

    public sealed class MwsCredentialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// name of credentials to register
        /// </summary>
        [Input("credentialsName", required: true)]
        public Input<string> CredentialsName { get; set; } = null!;

        /// <summary>
        /// ARN of cross-account role
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        public MwsCredentialsArgs()
        {
        }
        public static new MwsCredentialsArgs Empty => new MwsCredentialsArgs();
    }

    public sealed class MwsCredentialsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// (Integer) time of credentials registration
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        /// <summary>
        /// (String) identifier of credentials
        /// </summary>
        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        /// <summary>
        /// name of credentials to register
        /// </summary>
        [Input("credentialsName")]
        public Input<string>? CredentialsName { get; set; }

        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// ARN of cross-account role
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        public MwsCredentialsState()
        {
        }
        public static new MwsCredentialsState Empty => new MwsCredentialsState();
    }
}
