# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EntitlementsArgs', 'Entitlements']

@pulumi.input_type
class EntitlementsArgs:
    def __init__(__self__, *,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 service_principal_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Entitlements resource.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] group_id: Canonical unique identifier for the group.
        :param pulumi.Input[str] service_principal_id: Canonical unique identifier for the service principal.
        :param pulumi.Input[str] user_id: Canonical unique identifier for the user.
        """
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if service_principal_id is not None:
            pulumi.set(__self__, "service_principal_id", service_principal_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="servicePrincipalId")
    def service_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the service principal.
        """
        return pulumi.get(self, "service_principal_id")

    @service_principal_id.setter
    def service_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_principal_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


@pulumi.input_type
class _EntitlementsState:
    def __init__(__self__, *,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 service_principal_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering Entitlements resources.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] group_id: Canonical unique identifier for the group.
        :param pulumi.Input[str] service_principal_id: Canonical unique identifier for the service principal.
        :param pulumi.Input[str] user_id: Canonical unique identifier for the user.
        """
        if allow_cluster_create is not None:
            pulumi.set(__self__, "allow_cluster_create", allow_cluster_create)
        if allow_instance_pool_create is not None:
            pulumi.set(__self__, "allow_instance_pool_create", allow_instance_pool_create)
        if databricks_sql_access is not None:
            pulumi.set(__self__, "databricks_sql_access", databricks_sql_access)
        if group_id is not None:
            pulumi.set(__self__, "group_id", group_id)
        if service_principal_id is not None:
            pulumi.set(__self__, "service_principal_id", service_principal_id)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)
        if workspace_access is not None:
            pulumi.set(__self__, "workspace_access", workspace_access)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @allow_cluster_create.setter
    def allow_cluster_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_cluster_create", value)

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @allow_instance_pool_create.setter
    def allow_instance_pool_create(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_instance_pool_create", value)

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @databricks_sql_access.setter
    def databricks_sql_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "databricks_sql_access", value)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the group.
        """
        return pulumi.get(self, "group_id")

    @group_id.setter
    def group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_id", value)

    @property
    @pulumi.getter(name="servicePrincipalId")
    def service_principal_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the service principal.
        """
        return pulumi.get(self, "service_principal_id")

    @service_principal_id.setter
    def service_principal_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_principal_id", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Canonical unique identifier for the user.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "workspace_access")

    @workspace_access.setter
    def workspace_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "workspace_access", value)


class Entitlements(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 service_principal_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        This resource allows you to set entitlements to existing databricks_users, Group or ServicePrincipal

        ## Example Usage

        Setting entitlements for a regular user:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        me_user = databricks.get_user(user_name="me@example.com")
        me_entitlements = databricks.Entitlements("meEntitlements",
            user_id=me_user.id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```

        Setting entitlements for a service principal:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this_service_principal = databricks.get_service_principal(application_id="11111111-2222-3333-4444-555666777888")
        this_entitlements = databricks.Entitlements("thisEntitlements",
            service_principal_id=this_service_principal.sp_id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```

        Setting entitlements to all users in a workspace - referencing special `users` Group

        ```python
        import pulumi
        import pulumi_databricks as databricks

        users = databricks.get_group(display_name="users")
        workspace_users = databricks.Entitlements("workspace-users",
            group_id=users.id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * GroupMember to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User data to retrieve information about databricks_user.

        ## Import

        The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `user/user_id` - user `user_id`. * `group/group_id` - group `group_id`. * `spn/spn_id` - service principal `spn_id`. bash

        ```sh
         $ pulumi import databricks:index/entitlements:Entitlements me user/<user-id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] group_id: Canonical unique identifier for the group.
        :param pulumi.Input[str] service_principal_id: Canonical unique identifier for the service principal.
        :param pulumi.Input[str] user_id: Canonical unique identifier for the user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EntitlementsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to set entitlements to existing databricks_users, Group or ServicePrincipal

        ## Example Usage

        Setting entitlements for a regular user:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        me_user = databricks.get_user(user_name="me@example.com")
        me_entitlements = databricks.Entitlements("meEntitlements",
            user_id=me_user.id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```

        Setting entitlements for a service principal:

        ```python
        import pulumi
        import pulumi_databricks as databricks

        this_service_principal = databricks.get_service_principal(application_id="11111111-2222-3333-4444-555666777888")
        this_entitlements = databricks.Entitlements("thisEntitlements",
            service_principal_id=this_service_principal.sp_id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```

        Setting entitlements to all users in a workspace - referencing special `users` Group

        ```python
        import pulumi
        import pulumi_databricks as databricks

        users = databricks.get_group(display_name="users")
        workspace_users = databricks.Entitlements("workspace-users",
            group_id=users.id,
            allow_cluster_create=True,
            allow_instance_pool_create=True)
        ```
        ## Related Resources

        The following resources are often used in the same context:

        * End to end workspace management guide.
        * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        * Group data to retrieve information about Group members, entitlements and instance profiles.
        * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
        * GroupMember to attach users and groups as group members.
        * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
        * User data to retrieve information about databricks_user.

        ## Import

        The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `user/user_id` - user `user_id`. * `group/group_id` - group `group_id`. * `spn/spn_id` - service principal `spn_id`. bash

        ```sh
         $ pulumi import databricks:index/entitlements:Entitlements me user/<user-id>
        ```

        :param str resource_name: The name of the resource.
        :param EntitlementsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EntitlementsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_cluster_create: Optional[pulumi.Input[bool]] = None,
                 allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
                 databricks_sql_access: Optional[pulumi.Input[bool]] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 service_principal_id: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 workspace_access: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EntitlementsArgs.__new__(EntitlementsArgs)

            __props__.__dict__["allow_cluster_create"] = allow_cluster_create
            __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
            __props__.__dict__["databricks_sql_access"] = databricks_sql_access
            __props__.__dict__["group_id"] = group_id
            __props__.__dict__["service_principal_id"] = service_principal_id
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["workspace_access"] = workspace_access
        super(Entitlements, __self__).__init__(
            'databricks:index/entitlements:Entitlements',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_cluster_create: Optional[pulumi.Input[bool]] = None,
            allow_instance_pool_create: Optional[pulumi.Input[bool]] = None,
            databricks_sql_access: Optional[pulumi.Input[bool]] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            service_principal_id: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            workspace_access: Optional[pulumi.Input[bool]] = None) -> 'Entitlements':
        """
        Get an existing Entitlements resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_cluster_create: Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        :param pulumi.Input[bool] allow_instance_pool_create: Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        :param pulumi.Input[bool] databricks_sql_access: This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        :param pulumi.Input[str] group_id: Canonical unique identifier for the group.
        :param pulumi.Input[str] service_principal_id: Canonical unique identifier for the service principal.
        :param pulumi.Input[str] user_id: Canonical unique identifier for the user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EntitlementsState.__new__(_EntitlementsState)

        __props__.__dict__["allow_cluster_create"] = allow_cluster_create
        __props__.__dict__["allow_instance_pool_create"] = allow_instance_pool_create
        __props__.__dict__["databricks_sql_access"] = databricks_sql_access
        __props__.__dict__["group_id"] = group_id
        __props__.__dict__["service_principal_id"] = service_principal_id
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["workspace_access"] = workspace_access
        return Entitlements(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowClusterCreate")
    def allow_cluster_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
        """
        return pulumi.get(self, "allow_cluster_create")

    @property
    @pulumi.getter(name="allowInstancePoolCreate")
    def allow_instance_pool_create(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instance_pool_id argument.
        """
        return pulumi.get(self, "allow_instance_pool_create")

    @property
    @pulumi.getter(name="databricksSqlAccess")
    def databricks_sql_access(self) -> pulumi.Output[Optional[bool]]:
        """
        This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
        """
        return pulumi.get(self, "databricks_sql_access")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[Optional[str]]:
        """
        Canonical unique identifier for the group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="servicePrincipalId")
    def service_principal_id(self) -> pulumi.Output[Optional[str]]:
        """
        Canonical unique identifier for the service principal.
        """
        return pulumi.get(self, "service_principal_id")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[Optional[str]]:
        """
        Canonical unique identifier for the user.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="workspaceAccess")
    def workspace_access(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "workspace_access")

