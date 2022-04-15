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
    /// &gt; **Note** This resource has an evolving API, which will change in the upcoming versions of the provider in order to simplify user experience.
    /// 
    /// Make sure you have authenticated with username and password for Accounts Console. This resource configures the delivery of the two supported log types from Databricks workspaces: [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html). You cannot delete a log delivery configuration, but you can disable it when you no longer need it. This fact is important because there is a limit to the number of enabled log delivery configurations that you can create for an account. You can create a maximum of two enabled using the account level *(without workspace filter)* and two that use the workspace filter. There is an additional uniqueness constraint that two enabled configurations cannot share all their fields (not including the `config_name`). Re-enabling may fail when there's a violation of limit or uniqueness constraints.
    /// 
    /// ## Billable Usage
    /// 
    /// CSV files are delivered to `&lt;delivery_path_prefix&gt;/billable-usage/csv/` and are named `workspaceId=&lt;workspace-id&gt;-usageMonth=&lt;month&gt;.csv`, which are delivered daily by overwriting the month's CSV file for each workspace. Format of CSV file, as well as some usage examples, can be found [here](https://docs.databricks.com/administration-guide/account-settings/usage.html#download-usage-as-a-csv-file).
    /// 
    /// Common processing scenario is to apply [cost allocation tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html), that could be enforced by setting custom_tags on a cluster or through cluster policy. Report contains `clusterId` field, that could be joined with data from AWS [cost and usage reports](https://docs.aws.amazon.com/cur/latest/userguide/cur-create.html), that can be joined with `user:ClusterId` tag from AWS usage report.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var usageLogs = new Databricks.MwsLogDelivery("usageLogs", new Databricks.MwsLogDeliveryArgs
    ///         {
    ///             AccountId = @var.Databricks_account_id,
    ///             CredentialsId = databricks_mws_credentials.Log_writer.Credentials_id,
    ///             StorageConfigurationId = databricks_mws_storage_configurations.Log_bucket.Storage_configuration_id,
    ///             DeliveryPathPrefix = "billable-usage",
    ///             ConfigName = "Usage Logs",
    ///             LogType = "BILLABLE_USAGE",
    ///             OutputFormat = "CSV",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Audit Logs
    /// 
    /// JSON files with [static schema](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html#audit-log-schema) are delivered to `&lt;delivery_path_prefix&gt;/workspaceId=&lt;workspaceId&gt;/date=&lt;yyyy-mm-dd&gt;/auditlogs_&lt;internal-id&gt;.json`. Logs are available within 15 minutes of activation for audit logs. New JSON files are delivered every few minutes, potentially overwriting existing files for each workspace. Sometimes data may arrive later than 15 minutes. Databricks can overwrite the delivered log files in your bucket at any time. If a file is overwritten, the existing content remains, but there may be additional lines for more auditable events. Overwriting ensures exactly-once semantics without requiring read or delete access to your account.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var auditLogs = new Databricks.MwsLogDelivery("auditLogs", new Databricks.MwsLogDeliveryArgs
    ///         {
    ///             AccountId = @var.Databricks_account_id,
    ///             CredentialsId = databricks_mws_credentials.Log_writer.Credentials_id,
    ///             StorageConfigurationId = databricks_mws_storage_configurations.Log_bucket.Storage_configuration_id,
    ///             DeliveryPathPrefix = "audit-logs",
    ///             ConfigName = "Audit Logs",
    ///             LogType = "AUDIT_LOGS",
    ///             OutputFormat = "JSON",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * Provisioning Databricks on AWS guide.
    /// * databricks.MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
    /// * databricks.MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
    /// * databricks.MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) &amp; subnets for new workspaces within AWS.
    /// * databricks.MwsStorageConfigurations to configure root bucket new workspaces within AWS.
    /// * databricks.MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsLogDelivery:MwsLogDelivery")]
    public partial class MwsLogDelivery : Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Databricks log delivery configuration ID.
        /// </summary>
        [Output("configId")]
        public Output<string> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The optional human-readable name of the log delivery configuration. Defaults to empty.
        /// </summary>
        [Output("configName")]
        public Output<string?> ConfigName { get; private set; } = null!;

        /// <summary>
        /// The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
        /// </summary>
        [Output("credentialsId")]
        public Output<string> CredentialsId { get; private set; } = null!;

        /// <summary>
        /// Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
        /// </summary>
        [Output("deliveryPathPrefix")]
        public Output<string?> DeliveryPathPrefix { get; private set; } = null!;

        /// <summary>
        /// The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
        /// </summary>
        [Output("deliveryStartTime")]
        public Output<string> DeliveryStartTime { get; private set; } = null!;

        /// <summary>
        /// The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
        /// </summary>
        [Output("logType")]
        public Output<string> LogType { get; private set; } = null!;

        /// <summary>
        /// The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
        /// </summary>
        [Output("outputFormat")]
        public Output<string> OutputFormat { get; private set; } = null!;

        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
        /// </summary>
        [Output("storageConfigurationId")]
        public Output<string> StorageConfigurationId { get; private set; } = null!;

        /// <summary>
        /// By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the E2 version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
        /// </summary>
        [Output("workspaceIdsFilters")]
        public Output<ImmutableArray<int>> WorkspaceIdsFilters { get; private set; } = null!;


        /// <summary>
        /// Create a MwsLogDelivery resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsLogDelivery(string name, MwsLogDeliveryArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsLogDelivery:MwsLogDelivery", name, args ?? new MwsLogDeliveryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsLogDelivery(string name, Input<string> id, MwsLogDeliveryState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsLogDelivery:MwsLogDelivery", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MwsLogDelivery resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsLogDelivery Get(string name, Input<string> id, MwsLogDeliveryState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsLogDelivery(name, id, state, options);
        }
    }

    public sealed class MwsLogDeliveryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Databricks log delivery configuration ID.
        /// </summary>
        [Input("configId")]
        public Input<string>? ConfigId { get; set; }

        /// <summary>
        /// The optional human-readable name of the log delivery configuration. Defaults to empty.
        /// </summary>
        [Input("configName")]
        public Input<string>? ConfigName { get; set; }

        /// <summary>
        /// The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
        /// </summary>
        [Input("credentialsId", required: true)]
        public Input<string> CredentialsId { get; set; } = null!;

        /// <summary>
        /// Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
        /// </summary>
        [Input("deliveryPathPrefix")]
        public Input<string>? DeliveryPathPrefix { get; set; }

        /// <summary>
        /// The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
        /// </summary>
        [Input("deliveryStartTime")]
        public Input<string>? DeliveryStartTime { get; set; }

        /// <summary>
        /// The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
        /// </summary>
        [Input("logType", required: true)]
        public Input<string> LogType { get; set; } = null!;

        /// <summary>
        /// The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
        /// </summary>
        [Input("outputFormat", required: true)]
        public Input<string> OutputFormat { get; set; } = null!;

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
        /// </summary>
        [Input("storageConfigurationId", required: true)]
        public Input<string> StorageConfigurationId { get; set; } = null!;

        [Input("workspaceIdsFilters")]
        private InputList<int>? _workspaceIdsFilters;

        /// <summary>
        /// By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the E2 version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
        /// </summary>
        public InputList<int> WorkspaceIdsFilters
        {
            get => _workspaceIdsFilters ?? (_workspaceIdsFilters = new InputList<int>());
            set => _workspaceIdsFilters = value;
        }

        public MwsLogDeliveryArgs()
        {
        }
    }

    public sealed class MwsLogDeliveryState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Databricks log delivery configuration ID.
        /// </summary>
        [Input("configId")]
        public Input<string>? ConfigId { get; set; }

        /// <summary>
        /// The optional human-readable name of the log delivery configuration. Defaults to empty.
        /// </summary>
        [Input("configName")]
        public Input<string>? ConfigName { get; set; }

        /// <summary>
        /// The ID for a Databricks credential configuration that represents the AWS IAM role with policy and trust relationship as described in the main billable usage documentation page.
        /// </summary>
        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        /// <summary>
        /// Defaults to empty, which means that logs are delivered to the root of the bucket. The value must be a valid S3 object key. It must not start or end with a slash character.
        /// </summary>
        [Input("deliveryPathPrefix")]
        public Input<string>? DeliveryPathPrefix { get; set; }

        /// <summary>
        /// The optional start month and year for delivery, specified in YYYY-MM format. Defaults to current year and month. Usage is not available before 2019-03.
        /// </summary>
        [Input("deliveryStartTime")]
        public Input<string>? DeliveryStartTime { get; set; }

        /// <summary>
        /// The type of log delivery. `BILLABLE_USAGE` and `AUDIT_LOGS` are supported.
        /// </summary>
        [Input("logType")]
        public Input<string>? LogType { get; set; }

        /// <summary>
        /// The file type of log delivery. Currently `CSV` (for `BILLABLE_USAGE`) and `JSON` (for `AUDIT_LOGS`) are supported.
        /// </summary>
        [Input("outputFormat")]
        public Input<string>? OutputFormat { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID for a Databricks storage configuration that represents the S3 bucket with bucket policy as described in the main billable usage documentation page.
        /// </summary>
        [Input("storageConfigurationId")]
        public Input<string>? StorageConfigurationId { get; set; }

        [Input("workspaceIdsFilters")]
        private InputList<int>? _workspaceIdsFilters;

        /// <summary>
        /// By default, this log configuration applies to all workspaces associated with your account ID. If your account is on the E2 version of the platform or on a select custom plan that allows multiple workspaces per account, you may have multiple workspaces associated with your account ID. You can optionally set the field as mentioned earlier to an array of workspace IDs. If you plan to use different log delivery configurations for several workspaces, set this explicitly rather than leaving it blank. If you leave this blank and your account ID gets additional workspaces in the future, this configuration will also apply to the new workspaces.
        /// </summary>
        public InputList<int> WorkspaceIdsFilters
        {
            get => _workspaceIdsFilters ?? (_workspaceIdsFilters = new InputList<int>());
            set => _workspaceIdsFilters = value;
        }

        public MwsLogDeliveryState()
        {
        }
    }
}