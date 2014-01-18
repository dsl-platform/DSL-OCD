package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableUrls_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableUrls_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableUrls_2("+ URI +")"

   def copy(oneSetOfNullableUrls: Set[Option[java.net.URI]] = this._oneSetOfNullableUrls): OneSetOfNullableUrls_2 = {

  require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    new OneSetOfNullableUrls_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableUrls = oneSetOfNullableUrls)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableUrls_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableUrls = result._oneSetOfNullableUrls
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableUrls_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableUrls = {
    _oneSetOfNullableUrls
  }

  def oneSetOfNullableUrls_= (value: Set[Option[java.net.URI]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableUrls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableUrls") oneSetOfNullableUrls: Set[Option[java.net.URI]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableUrls = if (oneSetOfNullableUrls == null) Set.empty else oneSetOfNullableUrls)

}

object OneSetOfNullableUrls_2 extends AggregateRootCompanion[OneSetOfNullableUrls_2]{

  def apply(
    oneSetOfNullableUrls: Set[Option[java.net.URI]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableUrls)
    require(oneSetOfNullableUrls ne null, "Null value was provided for property \"oneSetOfNullableUrls\"")
    new OneSetOfNullableUrls_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableUrls = oneSetOfNullableUrls)
  }

}
