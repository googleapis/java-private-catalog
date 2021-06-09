/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.privatecatalog.v1beta1;

import static com.google.cloud.privatecatalog.v1beta1.PrivateCatalogClient.SearchCatalogsPagedResponse;
import static com.google.cloud.privatecatalog.v1beta1.PrivateCatalogClient.SearchProductsPagedResponse;
import static com.google.cloud.privatecatalog.v1beta1.PrivateCatalogClient.SearchVersionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.privatecatalog.v1beta1.stub.PrivateCatalogStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link PrivateCatalogClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (cloudprivatecatalog.googleapis.com) and default port (443)
 *       are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of searchCatalogs to 30 seconds:
 *
 * <pre>{@code
 * PrivateCatalogSettings.Builder privateCatalogSettingsBuilder =
 *     PrivateCatalogSettings.newBuilder();
 * privateCatalogSettingsBuilder
 *     .searchCatalogsSettings()
 *     .setRetrySettings(
 *         privateCatalogSettingsBuilder
 *             .searchCatalogsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * PrivateCatalogSettings privateCatalogSettings = privateCatalogSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class PrivateCatalogSettings extends ClientSettings<PrivateCatalogSettings> {

  /** Returns the object with the settings used for calls to searchCatalogs. */
  public PagedCallSettings<
          SearchCatalogsRequest, SearchCatalogsResponse, SearchCatalogsPagedResponse>
      searchCatalogsSettings() {
    return ((PrivateCatalogStubSettings) getStubSettings()).searchCatalogsSettings();
  }

  /** Returns the object with the settings used for calls to searchProducts. */
  public PagedCallSettings<
          SearchProductsRequest, SearchProductsResponse, SearchProductsPagedResponse>
      searchProductsSettings() {
    return ((PrivateCatalogStubSettings) getStubSettings()).searchProductsSettings();
  }

  /** Returns the object with the settings used for calls to searchVersions. */
  public PagedCallSettings<
          SearchVersionsRequest, SearchVersionsResponse, SearchVersionsPagedResponse>
      searchVersionsSettings() {
    return ((PrivateCatalogStubSettings) getStubSettings()).searchVersionsSettings();
  }

  public static final PrivateCatalogSettings create(PrivateCatalogStubSettings stub)
      throws IOException {
    return new PrivateCatalogSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return PrivateCatalogStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return PrivateCatalogStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return PrivateCatalogStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return PrivateCatalogStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return PrivateCatalogStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return PrivateCatalogStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return PrivateCatalogStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected PrivateCatalogSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for PrivateCatalogSettings. */
  public static class Builder extends ClientSettings.Builder<PrivateCatalogSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(PrivateCatalogStubSettings.newBuilder(clientContext));
    }

    protected Builder(PrivateCatalogSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(PrivateCatalogStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(PrivateCatalogStubSettings.newBuilder());
    }

    public PrivateCatalogStubSettings.Builder getStubSettingsBuilder() {
      return ((PrivateCatalogStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to searchCatalogs. */
    public PagedCallSettings.Builder<
            SearchCatalogsRequest, SearchCatalogsResponse, SearchCatalogsPagedResponse>
        searchCatalogsSettings() {
      return getStubSettingsBuilder().searchCatalogsSettings();
    }

    /** Returns the builder for the settings used for calls to searchProducts. */
    public PagedCallSettings.Builder<
            SearchProductsRequest, SearchProductsResponse, SearchProductsPagedResponse>
        searchProductsSettings() {
      return getStubSettingsBuilder().searchProductsSettings();
    }

    /** Returns the builder for the settings used for calls to searchVersions. */
    public PagedCallSettings.Builder<
            SearchVersionsRequest, SearchVersionsResponse, SearchVersionsPagedResponse>
        searchVersionsSettings() {
      return getStubSettingsBuilder().searchVersionsSettings();
    }

    @Override
    public PrivateCatalogSettings build() throws IOException {
      return new PrivateCatalogSettings(this);
    }
  }
}
