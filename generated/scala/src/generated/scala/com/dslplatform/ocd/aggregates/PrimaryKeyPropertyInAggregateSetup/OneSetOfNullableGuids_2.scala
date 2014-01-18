package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfNullableGuids_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfNullableGuids_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfNullableGuids_2("+ URI +")"

   def copy(oneSetOfNullableGuids: Set[Option[java.util.UUID]] = this._oneSetOfNullableGuids): OneSetOfNullableGuids_2 = {

  require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)
    new OneSetOfNullableGuids_2(_URI = this.URI, __locator = this.__locator, _oneSetOfNullableGuids = oneSetOfNullableGuids)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableGuids_2): this.type = {
    this._URI = result._URI
    this._oneSetOfNullableGuids = result._oneSetOfNullableGuids
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfNullableGuids_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfNullableGuids = {
    _oneSetOfNullableGuids
  }

  def oneSetOfNullableGuids_= (value: Set[Option[java.util.UUID]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _oneSetOfNullableGuids = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfNullableGuids") oneSetOfNullableGuids: Set[Option[java.util.UUID]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfNullableGuids = if (oneSetOfNullableGuids == null) Set.empty else oneSetOfNullableGuids)

}

object OneSetOfNullableGuids_2 extends AggregateRootCompanion[OneSetOfNullableGuids_2]{

  def apply(
    oneSetOfNullableGuids: Set[Option[java.util.UUID]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(oneSetOfNullableGuids)
    require(oneSetOfNullableGuids ne null, "Null value was provided for property \"oneSetOfNullableGuids\"")
    new OneSetOfNullableGuids_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfNullableGuids = oneSetOfNullableGuids)
  }

}
