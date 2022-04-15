// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetAwsCrossAccountPolicy
    {
        /// <summary>
        /// &gt; **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
        /// 
        /// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricks.AwsS3Mount pages.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @this = Output.Create(Databricks.GetAwsCrossAccountPolicy.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide
        /// * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
        /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// </summary>
        public static Task<GetAwsCrossAccountPolicyResult> InvokeAsync(GetAwsCrossAccountPolicyArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAwsCrossAccountPolicyResult>("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args ?? new GetAwsCrossAccountPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
        /// 
        /// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// For more detailed usage please see databricks.getAwsAssumeRolePolicy or databricks.AwsS3Mount pages.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @this = Output.Create(Databricks.GetAwsCrossAccountPolicy.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * Provisioning AWS Databricks E2 with a Hub &amp; Spoke firewall for data exfiltration protection guide
        /// * databricks.getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
        /// * databricks.getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// </summary>
        public static Output<GetAwsCrossAccountPolicyResult> Invoke(GetAwsCrossAccountPolicyInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAwsCrossAccountPolicyResult>("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args ?? new GetAwsCrossAccountPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAwsCrossAccountPolicyArgs : Pulumi.InvokeArgs
    {
        [Input("passRoles")]
        private List<string>? _passRoles;

        /// <summary>
        /// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
        /// </summary>
        public List<string> PassRoles
        {
            get => _passRoles ?? (_passRoles = new List<string>());
            set => _passRoles = value;
        }

        public GetAwsCrossAccountPolicyArgs()
        {
        }
    }

    public sealed class GetAwsCrossAccountPolicyInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("passRoles")]
        private InputList<string>? _passRoles;

        /// <summary>
        /// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
        /// </summary>
        public InputList<string> PassRoles
        {
            get => _passRoles ?? (_passRoles = new InputList<string>());
            set => _passRoles = value;
        }

        public GetAwsCrossAccountPolicyInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAwsCrossAccountPolicyResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// AWS IAM Policy JSON document
        /// </summary>
        public readonly string Json;
        public readonly ImmutableArray<string> PassRoles;

        [OutputConstructor]
        private GetAwsCrossAccountPolicyResult(
            string id,

            string json,

            ImmutableArray<string> passRoles)
        {
            Id = id;
            Json = json;
            PassRoles = passRoles;
        }
    }
}