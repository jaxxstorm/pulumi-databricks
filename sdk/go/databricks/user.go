// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * databricksGroupMember to attach users and groups as group members.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * User data to retrieve information about databricks_user.
//
// ## Import
//
// # The resource scim user can be imported using idbash
//
// ```sh
//
//	$ pulumi import databricks:index/user:User me <user-id>
//
// ```
type User struct {
	pulumi.CustomResourceState

	// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrOutput `pulumi:"allowClusterCreate"`
	// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrOutput `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrOutput `pulumi:"databricksSqlAccess"`
	// This is an alias for the username that can be the full name of the user.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// ID of the user in an external identity provider.
	ExternalId pulumi.StringPtrOutput `pulumi:"externalId"`
	Force      pulumi.BoolPtrOutput   `pulumi:"force"`
	// This is the username of the given user and will be their form of access and identity.
	UserName        pulumi.StringOutput  `pulumi:"userName"`
	WorkspaceAccess pulumi.BoolPtrOutput `pulumi:"workspaceAccess"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	var resource User
	err := ctx.RegisterResource("databricks:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("databricks:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
	Active *bool `pulumi:"active"`
	// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is an alias for the username that can be the full name of the user.
	DisplayName *string `pulumi:"displayName"`
	// ID of the user in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	// This is the username of the given user and will be their form of access and identity.
	UserName        *string `pulumi:"userName"`
	WorkspaceAccess *bool   `pulumi:"workspaceAccess"`
}

type UserState struct {
	// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
	Active pulumi.BoolPtrInput
	// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is an alias for the username that can be the full name of the user.
	DisplayName pulumi.StringPtrInput
	// ID of the user in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	// This is the username of the given user and will be their form of access and identity.
	UserName        pulumi.StringPtrInput
	WorkspaceAccess pulumi.BoolPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
	Active *bool `pulumi:"active"`
	// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// This is an alias for the username that can be the full name of the user.
	DisplayName *string `pulumi:"displayName"`
	// ID of the user in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	Force      *bool   `pulumi:"force"`
	// This is the username of the given user and will be their form of access and identity.
	UserName        string `pulumi:"userName"`
	WorkspaceAccess *bool  `pulumi:"workspaceAccess"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
	Active pulumi.BoolPtrInput
	// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// This is an alias for the username that can be the full name of the user.
	DisplayName pulumi.StringPtrInput
	// ID of the user in an external identity provider.
	ExternalId pulumi.StringPtrInput
	Force      pulumi.BoolPtrInput
	// This is the username of the given user and will be their form of access and identity.
	UserName        pulumi.StringInput
	WorkspaceAccess pulumi.BoolPtrInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// Either user is active or not. True by default, but can be set to false in case of user deactivation with preserving user assets.
func (o UserOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// Allow the user to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
func (o UserOutput) AllowClusterCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.AllowClusterCreate }).(pulumi.BoolPtrOutput)
}

// Allow the user to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
func (o UserOutput) AllowInstancePoolCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.AllowInstancePoolCreate }).(pulumi.BoolPtrOutput)
}

// This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
func (o UserOutput) DatabricksSqlAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.DatabricksSqlAccess }).(pulumi.BoolPtrOutput)
}

// This is an alias for the username that can be the full name of the user.
func (o UserOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// ID of the user in an external identity provider.
func (o UserOutput) ExternalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ExternalId }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Force() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Force }).(pulumi.BoolPtrOutput)
}

// This is the username of the given user and will be their form of access and identity.
func (o UserOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

func (o UserOutput) WorkspaceAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.WorkspaceAccess }).(pulumi.BoolPtrOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
