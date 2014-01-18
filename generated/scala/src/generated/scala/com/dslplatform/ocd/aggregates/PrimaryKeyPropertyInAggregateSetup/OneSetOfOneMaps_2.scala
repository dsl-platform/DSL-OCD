package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneMaps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneMaps: Set[Map[String, String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneMaps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneMaps_2("+ URI +")"

   def copy(oneSetOfOneMaps: Set[Map[String, String]] = this._oneSetOfOneMaps): OneSetOfOneMaps_2 = {

  require(oneSetOfOneMaps ne null, "Null value was provided for property \"oneSetOfOneMaps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMaps)
    new OneSetOfOneMaps_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneMaps = oneSetOfOneMaps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneMaps_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneMaps = result._oneSetOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneMaps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneMaps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneMaps = {
    _oneSetOfOneMaps
  }

  def oneSetOfOneMaps_= (value: Set[Map[String, String]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneMaps") oneSetOfOneMaps: Set[Map[String, String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneMaps = if (oneSetOfOneMaps == null) Set.empty else oneSetOfOneMaps)

}

object OneSetOfOneMaps_2 extends AggregateRootCompanion[OneSetOfOneMaps_2]{

  def apply(
    oneSetOfOneMaps: Set[Map[String, String]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneMaps)
    require(oneSetOfOneMaps ne null, "Null value was provided for property \"oneSetOfOneMaps\"")
    new OneSetOfOneMaps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneMaps = oneSetOfOneMaps)
  }

}
