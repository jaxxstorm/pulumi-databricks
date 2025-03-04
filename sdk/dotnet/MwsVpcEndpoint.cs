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
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsVpcEndpoint:MwsVpcEndpoint")]
    public partial class MwsVpcEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        /// </summary>
        [Output("awsEndpointServiceId")]
        public Output<string> AwsEndpointServiceId { get; private set; } = null!;

        [Output("awsVpcEndpointId")]
        public Output<string> AwsVpcEndpointId { get; private set; } = null!;

        /// <summary>
        /// Region of AWS VPC
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// State of VPC Endpoint
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("useCase")]
        public Output<string> UseCase { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier of VPC Endpoint in Databricks Account
        /// </summary>
        [Output("vpcEndpointId")]
        public Output<string> VpcEndpointId { get; private set; } = null!;

        /// <summary>
        /// Name of VPC Endpoint in Databricks Account
        /// </summary>
        [Output("vpcEndpointName")]
        public Output<string> VpcEndpointName { get; private set; } = null!;


        /// <summary>
        /// Create a MwsVpcEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsVpcEndpoint(string name, MwsVpcEndpointArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsVpcEndpoint:MwsVpcEndpoint", name, args ?? new MwsVpcEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsVpcEndpoint(string name, Input<string> id, MwsVpcEndpointState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsVpcEndpoint:MwsVpcEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MwsVpcEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsVpcEndpoint Get(string name, Input<string> id, MwsVpcEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsVpcEndpoint(name, id, state, options);
        }
    }

    public sealed class MwsVpcEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        /// </summary>
        [Input("awsEndpointServiceId")]
        public Input<string>? AwsEndpointServiceId { get; set; }

        [Input("awsVpcEndpointId", required: true)]
        public Input<string> AwsVpcEndpointId { get; set; } = null!;

        /// <summary>
        /// Region of AWS VPC
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// State of VPC Endpoint
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("useCase")]
        public Input<string>? UseCase { get; set; }

        /// <summary>
        /// Canonical unique identifier of VPC Endpoint in Databricks Account
        /// </summary>
        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        /// <summary>
        /// Name of VPC Endpoint in Databricks Account
        /// </summary>
        [Input("vpcEndpointName", required: true)]
        public Input<string> VpcEndpointName { get; set; } = null!;

        public MwsVpcEndpointArgs()
        {
        }
        public static new MwsVpcEndpointArgs Empty => new MwsVpcEndpointArgs();
    }

    public sealed class MwsVpcEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// ID of Databricks VPC endpoint service to connect to. Please contact your Databricks representative to request mapping
        /// </summary>
        [Input("awsEndpointServiceId")]
        public Input<string>? AwsEndpointServiceId { get; set; }

        [Input("awsVpcEndpointId")]
        public Input<string>? AwsVpcEndpointId { get; set; }

        /// <summary>
        /// Region of AWS VPC
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// State of VPC Endpoint
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("useCase")]
        public Input<string>? UseCase { get; set; }

        /// <summary>
        /// Canonical unique identifier of VPC Endpoint in Databricks Account
        /// </summary>
        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        /// <summary>
        /// Name of VPC Endpoint in Databricks Account
        /// </summary>
        [Input("vpcEndpointName")]
        public Input<string>? VpcEndpointName { get; set; }

        public MwsVpcEndpointState()
        {
        }
        public static new MwsVpcEndpointState Empty => new MwsVpcEndpointState();
    }
}
