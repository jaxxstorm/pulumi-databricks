// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetServicePrincipal
    {
        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks_service principal to manage service principals
        /// </summary>
        public static Task<GetServicePrincipalResult> InvokeAsync(GetServicePrincipalArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServicePrincipalResult>("databricks:index/getServicePrincipal:getServicePrincipal", args ?? new GetServicePrincipalArgs(), options.WithDefaults());

        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks_service principal to manage service principals
        /// </summary>
        public static Output<GetServicePrincipalResult> Invoke(GetServicePrincipalInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServicePrincipalResult>("databricks:index/getServicePrincipal:getServicePrincipal", args ?? new GetServicePrincipalInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicePrincipalArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        [Input("active")]
        public bool? Active { get; set; }

        /// <summary>
        /// ID of the service principal. The service principal must exist before this resource can be retrieved.
        /// </summary>
        [Input("applicationId")]
        public string? ApplicationId { get; set; }

        /// <summary>
        /// Display name of the service principal, e.g. `Foo SPN`.
        /// </summary>
        [Input("displayName")]
        public string? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public string? ExternalId { get; set; }

        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("home")]
        public string? Home { get; set; }

        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("repos")]
        public string? Repos { get; set; }

        /// <summary>
        /// The id of the service principal.
        /// </summary>
        [Input("spId")]
        public string? SpId { get; set; }

        public GetServicePrincipalArgs()
        {
        }
        public static new GetServicePrincipalArgs Empty => new GetServicePrincipalArgs();
    }

    public sealed class GetServicePrincipalInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// ID of the service principal. The service principal must exist before this resource can be retrieved.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        /// <summary>
        /// Display name of the service principal, e.g. `Foo SPN`.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("home")]
        public Input<string>? Home { get; set; }

        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        [Input("repos")]
        public Input<string>? Repos { get; set; }

        /// <summary>
        /// The id of the service principal.
        /// </summary>
        [Input("spId")]
        public Input<string>? SpId { get; set; }

        public GetServicePrincipalInvokeArgs()
        {
        }
        public static new GetServicePrincipalInvokeArgs Empty => new GetServicePrincipalInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicePrincipalResult
    {
        /// <summary>
        /// Whether service principal is active or not.
        /// </summary>
        public readonly bool Active;
        public readonly string ApplicationId;
        /// <summary>
        /// Display name of the service principal, e.g. `Foo SPN`.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// ID of the service principal in an external identity provider.
        /// </summary>
        public readonly string ExternalId;
        /// <summary>
        /// Home folder of the service principal, e.g. `/Users/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        public readonly string Home;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Repos location of the service principal, e.g. `/Repos/11111111-2222-3333-4444-555666777888`.
        /// </summary>
        public readonly string Repos;
        /// <summary>
        /// The id of the service principal.
        /// </summary>
        public readonly string SpId;

        [OutputConstructor]
        private GetServicePrincipalResult(
            bool active,

            string applicationId,

            string displayName,

            string externalId,

            string home,

            string id,

            string repos,

            string spId)
        {
            Active = active;
            ApplicationId = applicationId;
            DisplayName = displayName;
            ExternalId = externalId;
            Home = home;
            Id = id;
            Repos = repos;
            SpId = spId;
        }
    }
}
