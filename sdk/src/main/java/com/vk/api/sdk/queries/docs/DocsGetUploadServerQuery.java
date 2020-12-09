package com.vk.api.sdk.queries.docs;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.docs.GetUploadServer;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Docs.getUploadServer method
 */
public class DocsGetUploadServerQuery extends AbstractQueryBuilder<DocsGetUploadServerQuery, GetUploadServer> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public DocsGetUploadServerQuery(VkApiClient client, UserActor actor) {
        super(client, "docs.getUploadServer", GetUploadServer.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID (if the document will be uploaded to the community).
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public DocsGetUploadServerQuery groupId(Integer value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected DocsGetUploadServerQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
